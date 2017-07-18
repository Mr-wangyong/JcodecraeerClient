package com.mrwang.jcodecraeerclient.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/18
 * Time: 上午11:00
 */
public class RetrofitCacheInterceptor implements Interceptor {
  private Context context;

  public RetrofitCacheInterceptor(Context context) {
    this.context = context;
  }

  @Override
  public Response intercept(@NonNull Chain chain) throws IOException {
    Request request = chain.request();
    if (!isNetworkReachable(context)) {
      request = request.newBuilder()
        .cacheControl(CacheControl.FORCE_CACHE)
        .build();
    }
    Response response = chain.proceed(request);
    if (isNetworkReachable(context)) {
      int maxAge = 60 * 60; // read from cache for 1 minute
      response.newBuilder()
        .removeHeader("Pragma")
        .header("Cache-Control", "public, max-age=" + maxAge)
        .build();
    } else {
      int maxStale = 60 * 60 * 24 * 28; // tolerate 4-weeks stale
      response.newBuilder()
        .removeHeader("Pragma")
        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
        .build();
    }
    return response;
  }

  private static Boolean isNetworkReachable(Context context) {
    ConnectivityManager cm = (ConnectivityManager) context
      .getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo current = cm.getActiveNetworkInfo();
    return current != null && (current.isAvailable());
  }
}
