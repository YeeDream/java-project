由于对于css的了解比较少，所以将css与jacascript整理在一起。
=

-----------------------------------------------

## 一.CSS

1.内部方式
  
  key:value;
  
  #id:对id为？进行样式设置
  
  element:对那种标签进行样式设置
  
  .class:对一组的标签进行样式设置


2.行间的优先级高于内部优先级高于外部优先级

## 二.JavaScript
1.基本语法，变量，变量运算符和表达式
 
  变量：值可以发生改变的值
 
  var 变量名[=值]

2.数组和集合
```javascript
var arr={数组元素};

var arr=new Array();

var arr=new Array(数组元素);
```
  
3.如何进行跳转

  (1)常规的JS页面跳转代码

```handlebars
    A.在原来的窗体中直接跳转用
    B.在新窗体中打开页面
    C.JS页面跳转参数的注解
```

 
  (2)跳转指定页面的JS代码
  

```handlebars
    window.history.back(-1);
    window.location.href=””;
```

  (3)页面停留指定时间再跳转
  
  (4)根据访客来源跳转的JS代码
```handlebars
    A.JS判断来路代码
    B.JS直接跳转代码
    C.ASP跳转代码判断来路
    D.ASP直接跳转
```
 (5)广告与网站页面一起的JS代码
```handlebars
    A.上面是广告下面是站群的代码
    B.全部覆盖的代码
    C.混淆防止搜索引擎被查的js调用
```

  (6)页面跳出框架
  
  (7)返回上一页 

5.原生AJAX
 
  (1)Ajax概念：通过XMLHttpRequest对象向服务器提出请求并处理响应，进行页面的局部更新
 
  (2)Ajax优缺点:
    
    优点：
           A.最大的一点是页面无刷新，用户的体验非常好  
           B.使用异步方式与服务器通信，具有更加迅速的响应能力
           C.“按需取数据”，可以最大程度的减少冗余请求，和响应对服务器和带宽的负担，节约空间和宽带租用成本
           D.基于标准化的并被广泛支持的技术，不需要下载插件或者小程序
    缺点：Ajax不支持浏览器back按钮
          安全问题ajax暴露了与服务器交互的细节
          对搜索引擎的支持比较弱
          破坏了程序的异常机制
          不容易调试
 
  (3)Ajax请求过程：创建XMLHttpRequest、连接服务器、发送请求、服务器做出响应、接收相应数据	
  
  (4)原理：通过对XMLHttpRequest对象来向服务器发异步请求，从服务器获得数据，然后用JavaScript来操作DOM而更新页面。这其中最关键的一步就是从服务器获得请求数据。
  
  (5)open(method,url,async)方法：
     method:发送请求所使用的方法（get或post）;与post相比，get更简单也更快，并且在大部分情况下都能用；然而，在以下情况下，请使用post请求：
        
    ①无法使用缓存文件（更新服务器上的文件或数据库）
    ②向服务器发送大量数据（post没有数据量限制）
    ③发送包含未知字符的用户输入时，post比get更稳定也更可靠
    
    url:规定服务器端脚本的
    URL(该文件可以是任何类型的文件，比如 .txt 和 .xml，或者服务器脚本文件，比如 .asp 和 .php （在传回响应之前，能够在服务器上执行任务）)；
    async:规定应当对请求进行异步(true)或同步(false)处理，true是在等待服务器响应时执行其它脚本，当响应就绪后对响应进行处理；false是等待服务器响应再执行。
  
  (6)send()方法可将请求送往服务器
  
  (7)onreadystatechange:存有处理服务器响应的函数，每当 readyState 改变时，onreadystatechange 函数就会被执行。
  
  (8)readyState:存有 XMLHttpRequest 的状态。

6.三种引用方式
 
  (1)行内引入
    
    <开始标签 on+事件类型=“js代码”></结束标签>
    行内引入方式必须结合事件来使用，但是内部js和外部js可以不结合事件
  
  (2)内部引入
     
    在head或body中，定义script标签，然后在script标签里面写js代码：
      <script>
        js代码
      </script>

 (3)外部引入
    
    定义外部js文件(.js结尾的文件)
    <scripttype="text/javascript" src="demo.js"></script>
    注：①script标签一般定义在head或body中
        ②script标签要单独使用，要么引入外部js,要么定义内部js,不要混搭使用。
