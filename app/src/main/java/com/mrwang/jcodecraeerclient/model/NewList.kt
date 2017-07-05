package com.mrwang.jcodecraeerclient.model

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午6:46
 */
data class NewList(
        val total_count: Int,
        val isIncomplete_results: Boolean,
        val items: List<NewItem>
)

/**
 * total_count : 3605
 * incomplete_results : false
 * items : [{"id":8147,"title":"Android涓叧浜庨」鐩腑瀵筎hread鐨勭鐞嗭紙涓嶆槸绾跨▼姹狅級","user":{"id":13662,"face":"http://www.jcodecraeer.com/uploads/userup/13662/myface.jpg","nickname":"鐚ご-ZT"},"content":"empty content in list","click":102,"comments":1,"stow":0,"upvote":1,"downvote":1,"url":"http://www.jcodecraeer.com/api/article_detail.php/8147","pubDate":"20灏忔椂浠ュ墠","thumbnail":"http://www.jcodecraeer.com/uploads/userup/13662/14c0925G-T45.png"},{"id":8146,"title":"Android ORM 妗嗘灦锛欸reenDao 浣跨敤璇﹁В锛堣繘闃剁瘒锛�","user":{"id":10358,"face":"http://www.jcodecraeer.com/uploads/userup/10358/myface.jpg","nickname":"Speedy"},"content":"empty content in list","click":80,"comments":0,"stow":0,"upvote":1,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8146","pubDate":"1澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/10358/1FF31KA6-1916-0-lp.png"},{"id":8145,"title":"AutoScrollBackLayout","user":{"id":6669,"face":"http://www.jcodecraeer.com/plugin/Identicon/index.php?string=gaoneng&size=30","nickname":"gaoneng"},"content":"empty content in list","click":249,"comments":0,"stow":1,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8145","pubDate":"1澶╀互鍓�","thumbnail":""},{"id":8144,"title":"Android ORM 妗嗘灦锛欸reenDao 浣跨敤璇﹁В","user":{"id":10358,"face":"http://www.jcodecraeer.com/uploads/userup/10358/myface.jpg","nickname":"Speedy"},"content":"empty content in list","click":108,"comments":0,"stow":0,"upvote":2,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8144","pubDate":"1澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/10358/1FF3120332-1R4-0-lp.jpeg"},{"id":8141,"title":"涓\u20ac姝ヨВ鍐冲簲鐢ㄥ姞鍥哄鑷碬alle娓犻亾淇℃伅澶辨晥鐨勮嚜鍔ㄥ寲鑴氭湰锛岃嚜鍔ㄧ敓鎴愭笭閬撳寘","user":{"id":11934,"face":"http://www.jcodecraeer.com/plugin/Identicon/index.php?string=JayGoo&size=30","nickname":"JayGoo"},"content":"empty content in list","click":34,"comments":0,"stow":1,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8141","pubDate":"2澶╀互鍓�","thumbnail":""},{"id":8140,"title":"浣跨敤DataBinding鏉ヨ缃┖鐘舵\u20ac�(浜�)-閲嶆柊鍔犺浇","user":{"id":5282,"face":"http://www.jcodecraeer.com/uploads/userup/5282/myface.jpeg","nickname":"ditclear"},"content":"empty content in list","click":55,"comments":0,"stow":0,"upvote":1,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8140","pubDate":"3澶╀互鍓�","thumbnail":""},{"id":8139,"title":"Kotlin瀹夊崜瀹炴垬涔婻etrofit + OkHttp","user":{"id":5301,"face":"http://www.jcodecraeer.com/uploads/userup/5301/myface.jpg","nickname":"zzyandroid"},"content":"empty content in list","click":82,"comments":0,"stow":0,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8139","pubDate":"3澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/5301/1FF1150Z9-6340-0-lp.png"},{"id":8138,"title":"IMUI for React Native","user":{"id":13692,"face":"http://www.jcodecraeer.com/uploads/userup/13692/myface.jpg","nickname":"Aceycle"},"content":"empty content in list","click":344,"comments":0,"stow":0,"upvote":3,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8138","pubDate":"4澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/13692/1F630150311-3522-0-lp.png"},{"id":8135,"title":"Kotlin瀹夊崜瀹炴垬涔婣dapter","user":{"id":5301,"face":"http://www.jcodecraeer.com/uploads/userup/5301/myface.jpg","nickname":"zzyandroid"},"content":"empty content in list","click":45,"comments":0,"stow":0,"upvote":2,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8135","pubDate":"4澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/5301/1F630121237-6156-0-lp.png"},{"id":8130,"title":"涓浗绋嬪簭鍛橀紦鍔卞笀鍦ㄦ棩鏈洕鍏夛紝鏃ユ湰缃戝弸澶у懠濂芥兂鍘讳腑鍥斤紒","user":{"id":1,"face":"http://www.jcodecraeer.com/uploads/userup/1/myface.png","nickname":"娉\u2033湪缃戜笂鐨勬棩瀛�"},"content":"empty content in list","click":40,"comments":1,"stow":0,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8130","pubDate":"5澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/allimg/170630/0132145492-0-lp.gif"},{"id":8129,"title":"浣跨敤MultiViewAdapter鍒涘缓Recyclerview adapter锛昏瘧锛�","user":{"id":8644,"face":"http://www.jcodecraeer.com/uploads/userup/8644/myface.png","nickname":"pinkman"},"content":"empty content in list","click":321,"comments":0,"stow":1,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8129","pubDate":"5澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/8644/14bKG17-MA.png"},{"id":8128,"title":" 涓\u20ac骞碅ndroid宸ヤ綔缁忛獙锛岄樋閲� 鐧惧害 缃戞槗 缇庡洟 灏忕背 蹇墜闈㈢粡","user":{"id":8644,"face":"http://www.jcodecraeer.com/uploads/userup/8644/myface.png","nickname":"pinkman"},"content":"empty content in list","click":483,"comments":0,"stow":6,"upvote":12,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8128","pubDate":"5澶╀互鍓�","thumbnail":""},{"id":8124,"title":"Android涓竴涓狝ctivity鍏抽棴鍙︿竴涓狝ctivity鎴栬\u20ac呭湪涓\u20ac涓狝ctivity涓叧闂涓狝ctivity","user":{"id":13662,"face":"http://www.jcodecraeer.com/uploads/userup/13662/myface.jpg","nickname":"鐚ご-ZT"},"content":"empty content in list","click":515,"comments":2,"stow":3,"upvote":1,"downvote":3,"url":"http://www.jcodecraeer.com/api/article_detail.php/8124","pubDate":"5澶╀互鍓�","thumbnail":""},{"id":8121,"title":"寰俊鍒峰崱鏀粯","user":{"id":10388,"face":"http://www.jcodecraeer.com/uploads/userup/10388/myface.jpg","nickname":"姹熷乏灏忔閮�"},"content":"empty content in list","click":194,"comments":0,"stow":2,"upvote":2,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8121","pubDate":"6澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/10388/M1kDY0oLFZdEPal-lp.jpg"},{"id":8120,"title":"Kotlin瀹夊崜瀹炴垬涔婼haredPreferences","user":{"id":5301,"face":"http://www.jcodecraeer.com/uploads/userup/5301/myface.jpg","nickname":"zzyandroid"},"content":"empty content in list","click":230,"comments":0,"stow":3,"upvote":0,"downvote":1,"url":"http://www.jcodecraeer.com/api/article_detail.php/8120","pubDate":"6澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/5301/1F62P94446-1I0-0-lp.png"},{"id":8119,"title":"Kotlin瀛﹀巻涔嬪唴鑱斿嚱鏁�","user":{"id":5301,"face":"http://www.jcodecraeer.com/uploads/userup/5301/myface.jpg","nickname":"zzyandroid"},"content":"empty content in list","click":48,"comments":2,"stow":0,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8119","pubDate":"6澶╀互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/5301/1F62P94258-4B9-0-lp.png"},{"id":8118,"title":"Kotlin瀛﹀巻涔嬪嚱鏁颁笌Lambda琛ㄨ揪寮�","user":{"id":5301,"face":"http://www.jcodecraeer.com/uploads/userup/5301/myface.jpg","nickname":"zzyandroid"},"content":"empty content in list","click":32,"comments":0,"stow":0,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8118","pubDate":"6澶╀互鍓�","thumbnail":""},{"id":8117,"title":"kotlin缁冩墜灏廌emo涓\u20ac鏋�","user":{"id":13657,"face":"http://www.jcodecraeer.com/plugin/Identicon/index.php?string=cuiyue1988&size=30","nickname":"cuiyue1988"},"content":"empty content in list","click":81,"comments":2,"stow":1,"upvote":2,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8117","pubDate":"1鍛ㄤ互鍓�","thumbnail":""},{"id":8115,"title":"杩欏彲鑳芥槸鏈\u20ac濂界殑RxJava 2.x 鍏ラ棬鏁欑▼锛堝洓锛�","user":{"id":12477,"face":"http://www.jcodecraeer.com/uploads/userup/12477/myface.png","nickname":"鍗楀皹"},"content":"empty content in list","click":161,"comments":0,"stow":2,"upvote":0,"downvote":0,"url":"http://www.jcodecraeer.com/api/article_detail.php/8115","pubDate":"1鍛ㄤ互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/userup/12477/1F62FZ337-5319-0-lp.png"},{"id":8110,"title":"鍦ˋndroid涓疄鐜板鏉傚姩鐢伙紙闄勫畬鏁翠唬鐮侊級","user":{"id":1,"face":"http://www.jcodecraeer.com/uploads/userup/1/myface.png","nickname":"娉\u2033湪缃戜笂鐨勬棩瀛�"},"content":"empty content in list","click":3499,"comments":1,"stow":17,"upvote":9,"downvote":1,"url":"http://www.jcodecraeer.com/api/article_detail.php/8110","pubDate":"2鍛ㄤ互鍓�","thumbnail":"http://www.jcodecraeer.com/uploads/170624/1-1F624003525c5.png"}]
 */


/**
 * id : 8147
 * title : Android涓叧浜庨」鐩腑瀵筎hread鐨勭鐞嗭紙涓嶆槸绾跨▼姹狅級
 * user : {"id":13662,"face":"http://www.jcodecraeer.com/uploads/userup/13662/myface.jpg","nickname":"鐚ご-ZT"}
 * content : empty content in list
 * click : 102
 * comments : 1
 * stow : 0
 * upvote : 1
 * downvote : 1
 * url : http://www.jcodecraeer.com/api/article_detail.php/8147
 * pubDate : 20灏忔椂浠ュ墠
 * thumbnail : http://www.jcodecraeer.com/uploads/userup/13662/14c0925G-T45.png
 */
data class NewItem(
        val id: Int,
        val title: String,
        val user: UserBean,
        val content: String,
        val click: Int,
        val comments: Int,
        val stow: Int,
        val upvote: Int,
        val downvote: Int,
        val url: String,
        val pubDate: String,
        val thumbnail: String)

/**
 * id : 13662
 * face : http://www.jcodecraeer.com/uploads/userup/13662/myface.jpg
 * nickname : 鐚ご-ZT
 */
data class UserBean(
        val id: Int,
        val face: String,
        val nickname: String
)

