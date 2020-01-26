简单了解jQuery
-

1.基本结构
  
  jQuery语句主要包含三大部分：$()、document()和ready()分别被称为工厂函数、选择器、方法。
  
  语法：$(selector).action();

2.类型转换

   DOM对象和jQuery之间不能相互使用他人的内容

   jQuery对象就是通过jQuery包装DOM对象之后产生的对象
   
  (1)获取到DOM对象				
    
```
     var obj=document.getElementById("obj");
```

(2)获取到jQuery对象
		
```
     var $obj=$(obj);
```

  (3)将jQuery对象转化为DOM对象
     
```
     var obj=$obj.get(0);
     var obj=$obj[0];
```

  (4)将DOM对象转化为jQuery对象
     
```
     var $obj=$(obj);
```

3.选择器
  
  (1)基本选择器 
    
     ID选择器(#)、类选择器(.)、标签选择器(element)、通配符选择器(*)、并集选择器(,)

$("#demo")：选择id为demo的第一个元素
    
$(".liItem")：选择所有类名（样式名）为liltem的元素
    
$("div")：选择所有标签名字为div的元素
    
$("*")：选择所有元素（少用或配合其它选择器来使用）
    
$(".liItem,div")：选择多个指定的元素，这个地方是选择了.liltem元素和div元素
  
  (2)层次选择器
     
     空格：后代选择器   选择所有的后代元素
     >:子代选择器   选择所有的子代元素
     +:紧邻选择器   选择紧挨着的下一个元素
     ~:兄弟元素器   选择后面的所有的兄弟元素
  
  (3)可见与不可见选择器
     
    $(selector).toggle(时间):显示被隐藏的元素，隐藏已显示的元素
    隐藏的：$(selector).hide()
    可见的：$(selector).show()
    例：
    $("#hide").click(function(){
      $("p").hide();
    });

    $("#show").click(function(){
      $("p").show();
    });



  (4)属性相关选择器
    
$(“a[href]”):选择所有包含href属性的元素

$(“a[href=’luffy’]”):选择href属性值为luffy的所有a标签
     
$(“a[href!=’baidu’]”):选择属性不等于baidu的所有元素（包括没有href的元素）
    
$(“a[href^=’web’]”):选择所有以web开头的元素

$(“a[href$=’cn’]”):选择所有以cn结尾的元素
    
$(“a[href*=’i’]”):选择所有包含i这个字符的元素，可以是中英文
     
$(“a[href][titile]=’我’]”):选择所有符号指定属性规则的元素，都符合才会被选中

4.节点操作
  
  DOM里的节点通常分为3种类型：元素节点、文本节点、属性节点
  
   (1)创建节点：var 一个$(标签内容)
  
   (2)插入子节点：
     append():将父节点追加到子节点中
  
     prepend():
  
     appendTo():子节点填入父节点
  
     prependTo():
   
   (3)元素外部插入同辈节点
       
    after():在每个匹配的元素后插入内容$(A).after(B)表示将被插入a后
    before():
    insertAfter():以新节点为发起者
    insertBefore():
   
   (4)删除节点的方法：
    remove():删除整个节点
    empty():清空节点，节点保留，内容为空
    detach():删除节点，元素保留
   
   (5)替换节点：
    replace with():用旧节点触发（里为新节点）
    Replace all():用新节点触发（里为旧节点）
   
   (6)节点复制：
    clone():括号内为true时为复制，同时复制并绑定内容，false是为不复制

5.常用方法
      
(1)显示：show();隐藏：hide();动态切换：toggle();幕布上：slideup();幕布下：slideDown();渐进：fadeIn();渐隐：fadeOut();

(2)查找和遍历筛选
       
$("#ID").map(callback):将一组元素转换成其他数组

$("#ID").find(expr):搜索所有与指定表达式匹配的元素

$("#ID").children():获得匹配元素集合中每个元素的所有子元素

$("#ID").parent():获得当前匹配元素集合中每个元素的祖先元素

$("#ID").parents():获得当前匹配元素集合中每个元素的父元素

$("#ID").filter():将匹配元素集合缩减为匹配选择器或匹配函数返
回值的新元素

$("#ID").not():从匹配元素集合中删除元素

$("#ID").add():将元素添加到匹配元素的集合中

$("#ID").slice():将匹配元素集合缩减为指定范围的子集

$("#ID").siblings():获得匹配元素集合中所有元素的同辈元素

$("#ID").prev() / 
prevAll():获得匹配元素集合中每个元素紧邻的前一个/所有同辈元素

$("#ID").next()/nextAll():获得匹配元素集合中每个元素紧邻的一
个/所有同辈元素

(3)取值和赋值操作

$("#ID").val()：取value值

$("#ID").val("xxx")：赋值

$("#ID").text()：相当于取innerText

$("#ID").text("")：相当于赋值给innerText

$("#ID").html()：相当于取innerHTML

$("#ID").html("")：相当于赋值给innerHTML

6.三种AJAX操作
  
(1)$.get(URL,[data],[callback],[type]),请求方式为get
     
    url:请求路径
    data:请求参数
    callback:回调函数
    type:响应结果的类型
  
(2)$.post(URL,[data],[callback],[type]),请求方式为post
  
(3)$.ajax({url,data,type,data type})
   
7.

 :enabled	    $(":enabled")	   所有激活的 input 元素

 :disabled	$(":disabled")	所有禁用的 input 元素

 :selected	$(":selected")	所有被选取的 input 元素

 :checked	    $(":checked")	   所有被选中的 input 元素