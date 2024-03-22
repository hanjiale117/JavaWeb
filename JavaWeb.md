# JavaWeb

# 1.Web介绍

## 1.1.Web标准

Web标准也称为网页标准

由三个组成部分组成:

1. HTML:负责网页的结构(显示页面元素和内容)
2. CSS:负责网页的表现(页面的外观,位置等页面样式,如:颜色,大小等)
3. JavaScript:负责网页的行为(交互效果)

.

## 1.2.HTML和CSS的介绍

- HTML(HyperText Markup Language) : 超文本标记语言
- 超文本:超越文本的限制,比普通文本更强大,除了文字信息,还可以定义图片,音频视频内容等内容
- 标记语言:有标签构成的语言
  - HTML标签是**预订**好的.例如:使用\<a>展示超链接.使用\<img>展示图片,\<video>展示视频
  - HTML代码直接在浏览器中运行,由浏览器对HTML标签进行解析

- CSS(Cascading Style Sheet) : 层叠样式表,用于控制页面的样式(表示出来)

  [w3school.com.cn](查找HTML+CSS的参考手册)**HTML+CSS的参考手册**

  

  

# 2.HTML

## 2.1.HTML结构标签

```html
<html>
		<head>
				<title> 标题 </title>
		</head>
		<body>
				<h1>Hello HTML </h1>
		</body>
</html>
```

## 2.2.HTML特点

- HTML标签不区分大小写
- HTML标签属性值单双引号都可以
- HTML语法松散



## 2.3.HTML排版

- 图片标签: \<img>
  - src:指定图像的url(绝对路径/相对路径)
  - width:图像的宽度( 像素 / 相对于父元素的百分比)
  - height:图像的高度 (像素 / 相对于父元素的百分比)
  - 绝对路径:绝对磁盘路径(D:/XXXX). 绝对网络路径(https://XXXX)
  - 相对路径:从当前文件开始查找.(./ :当前目录,../ :上级目录)
- 标题标签: \<h1> - \<h6>
- 水平线标签:\<hr>



## 2.4.HTML标题样式

- CSS引入方式:

  - 行内样式:写在标签的style属性中(不常用)

    ```html
    <h1 style = "xxx:xxx; xxx:xxx;">中国新闻网</h1>
    ```

  - 内嵌样式:写在style标签中(可以写在页面的任何位置但通常约定写在head标签中)

    ```html
    <style>
      h1{
        xxx:xxx;
        xxx:xxx;
      }
    </style>
    ```

  - 外联样式:写在一个单独的.css文件中(需要通过 link 标签在网页中引入)

    ```html
    h1{
    		xxx:xxx;
    		xxx:xxx;
    }
    <link rel= "stylesheet" href="css/news.css">
    ```

- 颜色表示形式

  | 表示方法       | 表示含义                        | 取值                                     |
  | -------------- | ------------------------------- | ---------------------------------------- |
  | 关键字         | 预定义的颜色名                  | red,greeen,blue…..                       |
  | RGB表示法      | 红绿蓝三原色,每项取值范围:0-255 | rgb(0,0,0),rgb(255,255,255),rgb(255,0,0) |
  | 十六进制表示法 | #开头,将数字转换成十六进制表示  | #000000,#ff0000,#ccccccc,简写:#000,#ccc  |

- CSS选择器:用来选取需要设置样式的元素(标签)

  - 元素选择器

    ```html
    元素名称{			
    		color:red;
    }
    ```

    ```html
    h1{
    		color:red;
    }
    ```

  - id选择器

    ```html
    #id属性值{
    		color:red;
    }
    ```

    ```html
    #hid{
    		color:red;
    }
    ```

  - 类选择器

    ```html
    .class属性值{
    		color;red;
    }
    ```

    ```html
    .cls{
    		color:red;
    }
    ```

    ```html
    <style>
          h1{
              color:#f00;
          }
          /* 元素选择器 */
          /* span{
              color: rgb(168, 130, 173);
          } */
          /* 类选择器 */
          /* .cls{
              color: rgb(168, 179, 173);
          } */
          /* ID选择器 */
          #time{
              color:#f00;
              /* font-size设置字体大小 */
              font-size: 20px;
          }
    </style>
    <!-- ID选择器 > 类选择器 > 元素选择器 -->
    ```

  - \<span>标签

    1. \<span>标签是一个在开发网页时大量用到的没有语义的布局标签
    2. 特点:一行可以显示多个(组合内元素),宽度和高度默认由内容撑开





## 2.5.HTML超链接标签

- 标签

  `<a href="..." target= "...">央视网</a>`

- 属性

  href:指定资源访问url

  target:指定在何处打开资源链接

  \_self:默认值,在当前页面打开

  \_blank:在空白页面打开

  ```html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>练习</title>
      <style>
              h1{
                  color:#f00;
              }
              #time{
                  color:#f00;
                  /* font-size 设置字体大小 */
                  font-size: 20px;
              }
              a {
                  color: #000;
                  /* text-decoration 设置文本为一个标准的文本  默认去除下划线*/
                	/*-- none 表示定义标准的文本*/
                  text-decoration: none;
              }
        			a:hover {
                	/*当指针指向超链接 这个超链接变成蓝色*/
                  color: blue; 
              }
  
      </style>
  </head>
  <body>
      
      <img src="./img/news_logo.png" width="10%"> <a href="https://leetcode.cn/" target="_blank" >LeetCode</a> >  正文
          <hr>
          <span class="cls" id="time">2024-3-8 11:29 China No.1</span>   <span class="cls"><a href="https://www.sias.edu.cn/" target="_blank">Sias</a> </span>
          <hr>
  </body>
  </html>
  ```





## 2.6.HTML正文排版

- 视频标签: \<video>

  - src:规定视频的URL
  - **controls:显示播放控件(必须写上)**
  - width:播放器的宽度
  - height:播放器的高度

  ```html
  <!-- 视频 -->
      <!-- 在HTML当中 如果属性名和属性值一样 那么后面的 = "controls" 可以进行省略 直接写 controls-->
      <video src="video/1.mp4" controls = "controls" width=" 60%"></video>
  ```

- 音频标签:\<audio>

  - src:规定视频的URL
  - **controls:显示播放控件(必须写上)**

  ```html
  <!-- 音频 -->
    <audio src="audio/1.mp3" controls></audio> 
  ```

- 段落标签:\<p>

  ```html
  <p>
    文本内容
  </p>
  ```

- 文本加粗标签:\<b> / \<strong>**(带有强调语义的)**

  ```html
  <p>
  <b>央视网消息（焦点访谈）：</b>  
  <!-- strong具有强调语义 -->
  <strong>党的十八大以来，以习近平同志为核心的党中央始终把解决粮食安全问题作为治国理政的头等大事，
    重农抓粮一系列政策举措有力有效，
  </strong> 
    我国粮食产量站稳1.3万亿斤台阶，实现谷物基本自给、口粮绝对安全。
   我们把饭碗牢牢端在自己手中，为保障经济社会发展提供了坚实支撑
  </p>
  ```

- CSS样式

  - line-height :设置行高

  - text-indent:定义第一个行内容的缩进

  - text-align:规定元素中的文本的水平对齐方式

    ```html
    <style>
    #plast{
         text-align: right;
        }
    </style>
    <body>
      <p id="plast">
                BY:Dick;
            </p>
    </body>
    ```

    

- 空格

  在HTML中无论输入多少个空格,只会显示一个,可以使用空格占位符: &nbsp





## 2.7.HTML页面布局

### 2.7.1.盒子模型

- 盒子:页面中所有的元素(标签),都可以看做是一个盒子,由盒子将页面中的元素包含在一个矩形区域内,通过盒子的视角更加方便的进行页面布局
- 盒子模型组成:**内容区域(content),页边距区域(padding),边框区域(border),外边界区域(margin)**



### 2.7.2.页面布局标签

- 布局标签:实际开发中,会频繁使用div和span这个俩个没有语义的布局标签

- 标签\<div>\<span>

- div标签 :

  1. 一行只显示一个(独占一行)
  2. 宽度默认是父元素的宽度.高度由内容撑开
  3. 可以设置宽高(width,height)

- span标签

  1. 一行可以显示多个
  2. 宽度和高度默认由内容撑开
  3. 不可以设置宽高

  ```html
  <style>
  			#center{
                  width: 60%;
                  /* 用margin 来改变外边距 */
                  /* margin: 0% 17.5% 0% 17.5%; */
                  margin: 0 auto; /* 上下 左右 */
              }
  </style>
  
  <div id="center">
    									内容
  </div>
  ```

- CSS属性

  width:设置宽度

  height:设置高度

  border:设置边框属性

  padding:内边距

  margin:外边距

  **如果只需要设置某一个方位的边框,内边距,外边距,可以在属性后加 -位置 如“ padding-top, padding-left………”**



## 2.8.HTML表格.表单标签

###   2.8.1.表格标签

- 使用场景:在网页中以表格(行,列)形式整齐展示数据

- 标签:

  | 标签     | 描述                           | 属性/备注                                                    |
  | -------- | ------------------------------ | ------------------------------------------------------------ |
  | \<table> | 定义表格整体,可以包含多个\<tr> | border:规定表格边框的宽度<br />width:规定表格的宽度<br />cellspacing:规定单元之间的空间 |
  | \<tr>    | 表格的行,可以包裹多个\<td>     |                                                              |
  | \<td>    | 表格单元格(普通),可以包裹内容  | 如果这是表头单元格,可以替换为\<th>(table head)               |

  ```html
  <head>
      <style>
          td {
              text-align: center; /* 单元格内容居中展示 */
          }
      </style>
  </head>
  <body> 
      <!-- border 是设置表格的边框  cellspacing 是单元格之间的空白设置为0-->
      <table border="1px" cellspacing="0"  width="600px">
          <tr>
              <th>序号</th>
              <th>品牌Logo</th>
              <th>品牌名称</th>
              <th>企业名称</th>
          </tr>
          <tr>
              <td>1</td>
              <td> <img src="img/huawei.jpg" width="100px"> </td>
              <td>华为</td>
              <td>华为技术有限公司</td>
          </tr>
          <tr>
              <td>2</td>
              <td> <img src="img/alibaba.jpg"  width="100px"> </td>
              <td>阿里</td>
              <td>阿里巴巴集团控股有限公司</td>
          </tr>
      </table>
  
  </body>
  </html>
  ```

### 2.8.2.表单标签

  - 场景:在网页中主要负责数据采集功能 如注册,登录等数据采集

  - 标签:**\<form>**

  - 表单项:不同类型的input元素,下拉列表,文本域等.

    - \<input>:定义表单项,通过type属性控制输入形式
    - \<select>:定义下拉列表
    - \<textarea>:定义文本域 

  - 属性:

    - action:规定当提交表单时向何处发送表单数据,URL
    - method:规定用于发送表单数据的方式,GET,POST

    ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>HTML-表单</title>
    </head>
    <body>
        <!-- 	action:是指定提交地方的URL 不指定 默认提交当前页面
            	method:表单的提交方式
            	get:在URL后面拼接表单数据 比如:?user_name=1&age=1 默认提交为get
            	post:在消息体(请求体中)传递的,参数大小无限制; (F12工具查看)
          -->
        
        <!-- <form action="" method="get"> -->
        <form action="" method="post">
            用户名: <input type="text" name="user_name">
            <br>
            年龄:  <input type="text" name="age">
            <br>
            <input type="submit" value="提交">
        </form>
    </body>
    </html>
    ```

    **表单项必须有name属性才可以提交**

  - 表单标签

    1.\<input>:表单项:通过type属性输入形式

    | type取值                 | 描述                             | 形式 |
    | ------------------------ | -------------------------------- | ---- |
    | text                     | 默认值,定义单行的输入字段        |      |
    | password                 | 定义密码字段                     |      |
    | radio                    | 定义单选按钮                     |      |
    | checkbox                 | 定义复选框                       |      |
    | file                     | 定义文件上传按钮                 |      |
    | date/time/datetime-local | 定义日期/时间/日期时间           |      |
    | number                   | 定义数字输入框                   |      |
    | email                    | 定义邮件输入框                   |      |
    | hidden                   | 定义隐藏域                       |      |
    | submit/reset/button      | 定义提交按钮/重置按钮/可点击按钮 |      |

    2.\<select>:定义下拉列表,\<option>定义列表项

    3.\<textarea>:文本域

    ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>HTML-表单项标签</title>
    </head>
    <body>
    
    <!-- value: 表单项提交的值 -->
    <form action="" method="post">
         姓名: <input type="text" name="name"> <br><br>
         密码: <input type="password" name="password"> <br><br> 
         <!-- 当设置单选框的时候 需要设置的name是相同的 才能说明 这俩个单选框是同一族的 -->
         性别: <input type="radio" name="gender" value="1"> 男
         <!-- <label> 的作用是 当你点击label区域内 都可以聚焦到当前这个元素上 -->
              <label><input type="radio" name="gender" value="2"> 女 </label> <br><br>
              <!-- checkbox 为复选框 -->
         爱好: <label><input type="checkbox" name="hobby" value="java"> java </label>
              <label><input type="checkbox" name="hobby" value="game"> game </label>
              <label><input type="checkbox" name="hobby" value="sing"> sing </label> <br><br>
    
         图像: <input type="file" name="image">  <br><br>
    
         生日: <input type="date" name="birthday"> <br><br>
         时间: <input type="time" name="time"> <br><br>
         日期时间: <input type="datetime-local" name="datetime"> <br><br>
    
         邮箱: <input type="email" name="email"> <br><br>
         年龄: <input type="number" name="age"> <br><br>
         <!-- select 定义是一个下拉列表 -->
         学历: <select name="degree">
                   <option value="">----------- 请选择 -----------</option>
                   <option value="1">大专</option>
                   <option value="2">本科</option>
                   <option value="3">硕士</option>
                   <option value="4">博士</option>
              </select>  <br><br>
              <!-- textarea 定义一个文本域 -->
         描述: <textarea name="description" cols="30" rows="10"></textarea>  <br><br>
         <input type="hidden" name="id" value="1">
    
         <!-- 表单常见按钮 -->
         <input type="button" value="按钮">
         <input type="reset" value="重置"> 
         <input type="submit" value="提交">   
         <br>
    </form>
    
    </body>
    </html>
    ```



# 3.JavaScript

## 3.1.概念

JavaScript:是一门垮平台,面向对象的脚步语言,是用来控制网页行为的,他能使网页可交互

## 3.2.JS引入方式

### 3.2.1.内部脚本

- 内部脚本:将JS代码定义在HTML页面中

- JavaSrcipt代码必须位于\<script>\</script>标签之间

- 在HTML文档中,可以在任意地方,放置任意数量的\<script>

- 一般会把脚本置于\<body>元素底部,可改善显示速度

  ```html
  <script>
  	alert("Hello JavaScript")
  </script>
  ```



### 3.2.2.外部脚本

- 外部脚本:将JS代码定义在外部JS文件中,然后引入到HTML页面中

- 外部JS文件中,只包含JS代码,不包含\<script>标签

- \<script>标签不能自闭合

  ```xml
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>JS-引入方式</title>
      <!-- 内部脚本 -->
      <script>
          // 警告框 进页面就显示这个警告框
          // 这个警告框 可以在任意位置
          alert("hello js");
      </script>
  
      <!-- 外部脚本 -->
      <script src="js/demo.js"></script>
      <!-- <script src="js/demo.js">
              不能自闭合     
      -->
  </head>
  <body>
      
  </body>
  </html>
  ```

- JS-导入和导出外部脚本

  ```js
  //JS提供的导入和导出的机制 可以实现按需导入
  //单个导出
  export function simpleMessage(msg){
    console.log(msg)
  }
  export function complexMessage(msg){
    console.log(new Date() + ": "+ msg 
  }
                
  //批量导出
   function simpleMessage(msg){
    console.log(msg)
  }
   function complexMessage(msg){
    console.log(new Date() + ": "+ msg 
  }
  export {simpleMessage,comlexMessage}
  export {simpleMessage as cm,comlexMessage as sm}
  //在导出的时候进行重命名 
  //导入时候只能用这个重命名 不能再使用原来的名字
  
  exprot default {simpleMessage,complexMessage}//默认导出
  ```
  
  ```xml
  <body>
  	<div>
    	<button id="btn">点我展示信息</button>
    </div>
  	<!-- 导入showMessage.js文件的全部内容-->  
    <!-- -->
    <script type = "module">
   		import{complexMessage }from 'showMessage.js'
      
      <!--import{complexMessage as cm}from 'showMessage.js' -->
    	document.getElementById("btn").onclick = function(){
      	complexMessage('bbbbb');
      }
    </script>
  </body>
  ```
  
  ```xml
  <body>
  	<div>
    	<button id="btn">点我展示信息</button>
    </div>
  
    <script type = "module">
   		import messsageMethods from'./showMessage.js'
      <!-- 导入的是默认内容 不用加{} 如果是非默认的内容就需要加上{}-->
      <!-- messageMethods代表所有的JS文件中导出的内容
  		直接调用这个方法就行
  		-->
      document.getElementById("btn").onclick = function(){
      	messageMethods.complexMessage('我还是被点击了')
      }
    </script>
  </body>
  ```
  
  

## 3.3.JS基础语法

### 3.3.1.书写语法

- 区分大小写:与Java一样, 变量名,函数名,以及其他的一切东西都是区分大小写
- 每行结尾的分号可有可无
- 注释:
  -  单行注释: // 注释内容
  - 多行注释: /\*注释内容\*/
- 大括号代表代码块



### 3.3.2.输出语句

- 使用 **window.alert()** 写入警告框

- 使用**document.write()** 写入HTML 在浏览器展示

- 使用**console.log()** 写入浏览器控制台

  ```html
  <script>
      alert("hi js");
      // alert("hi js") 结尾分号 可有可无
       
      // 1.alert 弹出警告框
      window.alert("hi!js1");
  
      // 2.write 写入HTML
      document.write("hi!js2");
  
      // 3.console.log 控制台输出 (F12 - 控制台)
      console.log("hi!js3");
  </script>
  ```



### 3.3.3.变量

- JavaScript中用var关键字(Variable 的缩写) 来声明变量

  ```javascript
  var a = 20;
  a = "dick";
  ```

- JavaScript是一门弱类型的语言,变量可以存放不同类型的值

- 变量名需要遵循如下规则:

  - 组成字符可以是任何字母,数字,下划线(__)或者是美元符号($)
  - 不能数字开头
  - 建议使用驼峰命名法

- 新增 let 关键字来定义变量,它的用法类似于var,但是声明的变量,只在let关键字的代码块内有效,且不允许重复声明

- 新增 const关键字,用来声明一个只读的常量,一旦声明,常量的值就不能改变

  ```html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>js-变量</title>
  </head>
  <body>
      
  </body>
  <script>
      
      var a = 10;
      alert(a);//10
      
      a = "dick";
      alert(a);//dick
  
      // var 的作用域大 是全局变量
      {
          var b = 10;
      }
      alert(b);
  
      // var定义的变量可以重复定义
      var a = 10;
      var a = "dick";//上面的a会被下面的a覆盖
  
  
      //let : 局部变量 且 不能重复定义
      {
          let x = 1;
          // let x = "a"; 编译报错
      }
      alert(x);
      //不会显示警告框
  
      //const :常量 不能修改
      const pi = 3.1415;
      pi = 3.15;
  
      alert(pi);
      // 页面开发者工具报错
      //Uncaught ReferenceError: x is not defined
      // at 2.3.js-变量.html:35:11
  
  </script>
  </html>
  ```







### 3.3.4.数据类型

- JS中分为:原始类型和引用类型.

- 原始类型:

  - number:数字(整数,小数,NaN(Not a number))
  - string:字符串,单双引号都可以
  - boolean:布尔,true,false
  - null:对象为空
  - undefined:当声明的变量未初始化,该变量的默认值是undefined

- 使用typeof运算符可以获取数据类型:

  ```javascript
  var a =20;
  alert(typeof a);
  ```

  ```html
  <script>
      alert(typeof 3);        //number
      alert(typeof 3.1);      //number
      alert(typeof "asd");    //string
      alert(typeof true);     //boolean
      alert(typeof false);    //boolean
      alert(typeof null);     //object 对象  早期bug 沿用至今 是被认为是对象的占位符
      var a ;
      alert(typeof a);        //undefined 没有初始化
  </script>
  ```



### 3.3.5.运算符

**和java相同**

**===:全等运算符**

**\==与\===:\==会进行类型转换,\=\=\= 不会进行类型转换** 

```html
<script>
    
    var age = 20;
    var _age = "20";
    var $age = 20;
    
    alert(age == _age); // ==会进行类型转换  true
    alert(age === _age);//=== 不会进行类型转换 false
    alert(age === $age);//true

</script>
```

- 字符串类型转为数字: 将字符串面值转为数字. 如果面值不是数字 则会转化为NaN

  ```html
  <script>
  		//类型转换 - 其他类型转换为数字
      alert(parseInt("12"));      //12
      alert(parseInt("12A45"));   //12   
      //从第一个字符开始匹配 如果有不是数字的字符 就不再转化后面的字符了 直接输出 转化过的字符
      alert(parseInt("A45"));     //NaN  
  </script>
  ```

- 其他类型转化为Boolean

  1. Number: 0 和NaN转化为False,其他转为true

     ```html
     <script>
     		// 类型转换 - 其他类型转换为boolean
         if(0){
             alert("0 转化为false");
         }
         if(NaN){
             alert("NaN 转化为false");
         }
         if(-1){
             alert("除0 和NaN 其他都转化为false");
         } 
     </script>
     ```

  2. String: 空字符串为false,其他均转换为 true

     ```html
     <script>
     		// 类型转换 - 字符串转化
         if ("") {   //false
             //空字符是false
             //空格是true;
             alert("空字符串 为false 其他都为true");
         }
     </script>
     ```

  3. Null 和 undefined :均为false

     ```html
     <script>
     		// Null 和undefined
         if (null) {
             alert("null 转化为false");//false
         }
         if (undefined) {
             alert("undefined 转化为false");//false
         }
     </script>
     ```

     

 ### 3.3.6.流程控制

- if-else
- switch
- for
- while
- do…while
- **与Java一样**

​     

## 3.4.JS函数

- 函数方法是被设计为执行特定任务的代码块

- 定义:JS函数通过function关键字进行定义

  ```javascript
  function functionName(参数1, 参数2){
  			...
  			//需要执行的代码
  }
  //例如
  function add(a,d){
    		return a + b;
  }
  
  ```

- 注意:

  1. 形式参数不需要类型 因为js是弱类型语言

  2. 返回值也不需要定义类型,可以在函数内部直接使用return进行返回即可

  3. 调用: 函数名称(实际参数列表)

     ```js
     var result = add (10,20);
     alert(result);
     ```

  ```js
  //定义函数-1:
      function add(a,b){
          return a + b;
      }
  
      //函数调用
      var a = add(1,2);
      alert(a);//3
  
  
      //定义方式-2:
      var add = function(a,b){
          return a + b;
      }
      
      //函数调用
      var result = add(2,3);
      alert(result);//5
    
    	//调用参数可以传递任意个参数 按照顺序赋值
    	var result = add(2,3,4,5,6);
      alert(result);//5
  ```

  





## 3.5.JS对象

###      3.5.1.Array数组

- JS中Array对象用于定义数组

- 定义:

  `var 变量名 = new Array(元素列表);       var arr = new Array(1,2,3,4);`

  `var 变量名 = [元素列表];                var arr = [1,2,3,4];`

- 访问:

  `arr[索引值] = 值                       arr[10] = "hello;"`

  ```js
  // 定义数组-1
  var arr = new Array(1,2,3,4,5);
  // 在控制台输出1,2,3;
  console.log(arr[0]);//1
  console.log(arr[1]);//2
  console.log(arr[2]);//3
  
  // 定义数组-2
  var arr = [1,2,3,4];
  console.log(arr[0]);//1
  console.log(arr[1]);//2
  console.log(arr[2]);//3
  
  // 数组特点 :长度可变 类型可变
  var arr = [1,2,3,4];
  arr[10] = 10;
  console.log(arr[10]);//10
  console.log(arr[9]); //undefined
  console.log(arr[8]); //undefined
  
  arr[9] = "a";
  arr[8] = true;
  console.log(arr[9]);
  console.log(arr[8]);
  console.log(arr);
  //1,2,3,4,true,"a",10,
  //length = 11;
  ```

  **JS中的数组相当于Java中的Array集合,数组长度可变,而且存储类型是任意的**

- length:设置或返回数组中元素的数量

  ```js
  // length属性
  
  var arr = [1,2,3,4];
  for (let i = 0; i < arr.length; i++) {
      console.log(arr[i]);            
  }
  //1 2 3 4
  ```

- forEach():遍历数组中的每个有值的元素,并调用一次传入的函数

  ```js
  // forEach 遍历数组中有值的元素
  
  var arr = [1,2,3,4];
  arr[10] = 10;
  arr.forEach(function(e) {
  console.log(e);
  });
  //1 2 3 4 10
  
  //ES6 箭头函数
  arr.forEach((e) => {
  console.log(e);
  });
  ```

- push():将新元素添加到数组的末尾,并返回新的长度

  ```js
  //push :添加元素到数组末尾
  arr.push(7,8,9);
  console.log(arr);
  //1 2 3 4 10 7 8 9
  ```

- splice():从数组中删除元素

  ```js
  //splice:删除元素
  //从2开始删 删除3个
  arr.splice(2,3);
  
  console.log(arr);
  //1 2 10 7 8 9
  ```

- 箭头函数(ES6):是用来简化函数定义语法的.具体形式为:(…) =>(…), 如果需要给箭头函数起名字 : `var xxx =(...) =>{....}`\





### 3.5.2.String

- String 字符串对象创建方式有俩种:

  `var 变量名 = new String("...");` `var str = new String("Hello String");`

  `var 变量名 ="...":` `var str = "Hello String";` `var str = 'Hello String';`

- length属性: 字符串长度

- 方法:

  - charAt() :返回指定位置的字符.
  - indexOf() :检索字符串
  - trim() :去除字符串俩边的空格
  - substring() : 提前字符串中俩个指定的索引号之间的字符

  ```js
  //创建字符串
  var str = "Hello string";
  
  console.log(str);
  //Hello string
  
  //length
  console.log(str.length);
  //12
  
  //charAt
  console.log(str.charAt(0));//H
  console.log(str.charAt(1));//E
  console.log(str.charAt(2));//L
  console.log(str.charAt(3));//L
  console.log(str.charAt(4));//O
  
  //indexOf
  console.log(str.indexOf("lo"));//3
  
  //trim 去除字符串左右俩侧的空格
  var str1 = str.trim();
  console.log(str1);
  
  //substring(start,end) start:开始索引 end:结束索引 含头不含尾
  console.log(str.substring(0,5));//Hello
  ```

## 3.6.JSON

### 3.6.1.JS自定义对象

- JS自定义对象:

  ```js
  var 对象 = {
    属性名1:属性值1,
    属性名2:属性值2,
    属性名3:属性值3;
    函数名称:function(形参列表){...}
  };
  
  var user = {
    name:"Tom",
    age:20,
    gender:"male",
    eat:function(){
      alert("用膳~");
    }
  };
  ```

- 调用格式:

  ```js
  //对象名.属性名;
  console.log(user.name);
  //对象名.函数名();
  user.eat();
  ```

  ```js
  //自定义对象
  var user = {
    name:"tom",
    age:10,
    gender:"male",
    // eat:function(){
    //     alert("eat~~");
    // }
    eat(){
        alert("eat~~");
        //简化后的函数
    }
  }
  alert(user.name);//tom
  user.eat();//eat~~
  ```



### 3.6.2.JSON-介绍

- 概念:JavaScript Object Notation,JavaScript对象标记法

- JSON 是通过JavaScript 对象标记**书写的文本**

- 由于其语法简单,层次结构鲜明,现多用于作为数据载体,在网络中进行数据传输

  ```js
  '{
    		"name":"Tom",
      	"age":20,
        "gender":"male"
  }'
  ```



### 3.6.3.JSON-基本语法

- 定义一个JSON:

  ```js
  var 变量名 = '{"key1":value1,"key2":value2}';
  ```

  ```js
  var userStr = '{"name":"Tom","age":18,"addr":["beijing","shanghai","xian"]}';
  ```

-  value的数据类型:

  1. 数字(整数或浮点数)
  2. 字符串(在双引号中)
  3. 逻辑值(true或者false)
  4. 数组(在方括号中)
  5. 对象(在花括号中)
  6. null

- JSON字符串转化为JS对象

  ```js
  var jsObject = JSON.parse(userStr);
  ```

- JS对象转化为JSON字符串

  ```js
  var jsonStr = JSON.stringify(jsObject);
  ```

  ```JS
  //定义一个JSON
  var jsonStr = '{"name":"Tom","age":18,"addr":["beijing","shanghai","xi`an"]}';
  alert(jsonStr.name);//undefined
  
  //json -> js
  var obj = JSON.parse(jsonStr);
  
  alert(obj.name);//Tom
  
  
  //js -> json
  
  alert(JSON.stringify(obj));
  //{"name":"Tom","age":18,"addr":["beijing","shanghai","xi`an"]}
  ```





##  3.7.BOM

- BOM (Browser Object Model) 浏览器对象模型,允许与JavaScript与浏览器对话,JavaScript 将浏览器的各个组成部分封装为对象
-  组成:
  - Window:浏览器对象窗口
  - Navigator:浏览器对象
  - Screen:屏幕对象
  - History:历史记录对象
  - Location:地址对象



### 3.7.1.Window

- 浏览器窗口对象

- 获取:直接使用Window,其中window可以省略

  ```js
  window.alert("Hello window");
  alert("Hello window");
  ```

- 属性:

  - History:对History对象的只读引用
  - Location:用于窗口或框架的Location对象
  - Navigator:对Navigator对象的只读引用

- 方法:

  - aler():显示带有一段信息和一个确认按钮的警告框.
  - confirm():显示带有一段消息及确认按钮和取消按钮的对话框
  - setlnterval():按照指定的周期(以毫秒计) 来调用函数或计算表达式
  - setTimeout():在指定的毫秒数后调用函数或计算表达式

  ```js
  // //获取window
  // window.alert("123");
  // alert("123");
  
  //方法
  
  //confirm  输出确认和取消框
  window.confirm("确认删除吗?")
  alert(confirm("?"));//确认返回值为true
  
  //setInterval 周期性的执行某函数
  var i  = 0;
  window.setInterval(function(){
      i++;
      console.log("执行了"+i+"次");
  },2000);//每2秒执行一次函数
  
  //setTimeout 延迟指定时间执行一次
  setTimeout(function () {
      alert("1");
  },2000);
  ```

- Location:

  - 地址栏对象

  - 获取:使用window.location获取,其中window.可以省略

    `window.location.属性`  	`locaton.属性` 

  - 属性:

    - herf:设置或返回完整URL

      `location.href = "https://www.itcast.cn";`

    ```js
    //location
    alert(location.href);//输出这个网页的域名
    //file:///E:/JavaWeb/JavaScriptSourceCode/2.11.js-BOM.html
    location.href = "https://www.baidu.com";
    //设置一个域名后 会自动跳转到这个域名下
    ```



## 3.8.DOM

### 3.8.1.DOM介绍

- Document Object Model, 文档对象模型

- DOM是W3C的标准,定义了访问HTML和XML文档的标准,分为3个不同的部分:

  1. Core DOM- 所有文档类型的标准模型
  2. XML DOM-XML文档的标准模型
  3. HTML DOM-HTML文档的标准模型

- 将标记语言的各个组成部分封装为对应的对象:

  - Document:整个文档对象
  - Element:元素对象
  - Attribute:属性对象
  - Text:文本对象
  - Comment:注释对象

  <a href="https://smms.app/image/r9qpw5FfLTdNWoa" target="_blank"><img src="https://s2.loli.net/2024/03/09/r9qpw5FfLTdNWoa.png" ></a>

### 3.8.2.DOM使用

- HTML中的Element对象可以通过Document对象获取,而Document对象是通过window对象获取的

- Document对象中提供了,以下获取Element元素对象的函数;

  1. 根据ID属性值获取,返回单个Element**对象**

     `var h1 = document.getElementById('h1');`

  2. 根据标签名称获取,返回Element对象**数组**

     `var divs = document.getElementsByTagName('div');`

  3. 根据name属性获取,返回Element对象**数组**

     `var hobbys = document.getElementByName('hobby');`

  4. 根据class属性值获取,返回Element对象数组

     `var clss = document.getElementsByClassName("cls");`

  ```html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
  </head>
  <body>
      <h1> <img id ="h1" src="./1.jpg" > </h1>
  
      <div class="cls">123</div> <br>
      <div class="cls">456</div> <br> 
  
      <label >
      <input type="checkbox" name="hobby">View
      </label>
      <label >
      <input type="checkbox" name="hobby">Trip
      </label>
      <label >
      <input type="checkbox" name="hobby">Game
      </label>
  
      
  </body>
  <script>
  
          //1.获取Element元素
          //1.1.ID
          var number = document.getElementById('h1');
          alert(number);
          //[object HTMLImageElement]
  
          //1.2.标签 返回值为数组
          var divs =  document.getElementsByTagName("div");
          for (let i = 0; i < divs.length; i++) {
              alert(divs[i]);            
          }
          //[object HTMLDivElement]
  
  
          //1.3.根据name属性获取
         var ins = document.getElementsByName('hobby');
          
          for (let i = 0; i < ins.length; i++) {
              alert(ins[i]);            
          }
          //[object HTMLInputElement]
  
          //1.4.根据Class属性获取
          var arrcls = document.getElementsByClassName("cls");
          for (let i = 0; i < arrcls.length; i++) {
              alert(arrcls[i]);            
          }
          //[object HTMLDivElement]
  </script>
  </html>
  ```
  
  ```js
  //更改元素
  var arrcls = document.getElementsByClassName("cls");
  
  var div1= arrcls[0]
  div1.innerHTML = "666";//元素内容的修改
  
  //更改元素 并添加颜色
  var ins = document.getElementsByClassName("cls");
  for (let i = 0; i< ins.length; i++) {
      ins[i].innerHTML += " <font color = 'red'>666</font>";
  }
  
  //使所有的复选框呈现被选中的状态
  var inss = document.getElementsByName('hobby');
  for (let i = 0; i < inss.length; i++) {
      inss[i].checked = true;
  }
  ```



## 3.9.JS事件监听

### 3.9.1.事件绑定

- 方法一:通过HTML标签中的事件属性进行绑定

  ```js
  <input type="button" onclick="on()" value="按钮1">
    <script>
    function on(){
    alert("被点击了");
  }
  </script>
  ```

- 方法二:通过DOM元素属性绑定

  ```js
  <input type="button" id="btn" value="按钮2">
    <script>
    document.getElementById('btn').onclick=function(){
    alert("被点击了")
  }
  ```

  ```html
  <body>
      <input type="button" id="btn1" value="按钮1" onclick="on()">
      <input type="button" id="btn2" value="按钮2">   
  </body>
  <script>
      //方式1
      function on() {
          alert("1");
      }
      //方式2
      document.getElementById("btn2").onclick = function () {
          alert("2");
      }
  </script>
  ```



### 3.9.2.常见事件

| 事件名      | 说明                     |
| ----------- | ------------------------ |
| onclick     | 鼠标单击                 |
| onblur      | 元素失去焦点             |
| onfocus     | 元素获得焦点             |
| onload      | 某个页面或图像被完成加载 |
| onsubmit    | 当表单提交时触发该事件   |
| onkeydown   | 某个键盘的键被按下       |
| onmouseover | 鼠标被移动到某元素之上   |
| onmouseout  | 鼠标从某元素移开         |

```html
<body>
    <img id="light" src="img/off.gif"> <br>
    <input type="button" value="点亮" onclick="on()"> 
    <input type="button"  value="熄灭" onclick="off()">
    <br> <br>
    <input type="text" id="name" value="ITCAST" onfocus="lower()" onblur="upper()">
    <br> <br>
    <input type="checkbox" name="hobby"> 电影
    <input type="checkbox" name="hobby"> 旅游
    <input type="checkbox" name="hobby"> 游戏
    <br>
    <input type="button" value="全选" onclick="checkAll()" > 
    <input type="button" value="反选" onclick="reverse()">
</body>
<script>
    //1. 点击 "点亮" 按钮, 点亮灯泡; 点击 "熄灭" 按钮, 熄灭灯泡; 
    function on(){
        //获取img对象
        var img = document.getElementById("light");
        img.src = "img/on.gif"
    }
    function off(){
        var img = document.getElementById("light");
        img.src = "img/off.gif"
    }
  
    //2. 输入框聚焦后, 展示小写; 输入框离焦后, 展示大写; 
    //聚焦 onfocus 离焦onblur
    function lower(){//小写
        var name = document.getElementById("name");
        //string方法
        name.value = name.value.toLowerCase("name");
    }
    function upper(){//大写
        var name = document.getElementById("name");
        //string方法
        name.value = name.value.toUpperCase("name");
    }

    //3. 点击 "全选" 按钮使所有的复选框呈现选中状态 ; 点击 "反选" 按钮使所有的复选框呈现取消勾选的状态 ; -- onclick
    function checkAll(){
        //先获取所有的复选框的元素对象
        var hobbys = document.getElementsByName("hobby");
        for (let i = 0; i < hobbys.length; i++) {
            const element = hobbys[i];
            element.checked = true;
        }
    }
    function reverse(){
        var hobbys = document.getElementsByName("hobby");
        for (let i = 0; i < hobbys.length; i++) {
            const element = hobbys[i];
            element.checked = false;
        }
    }
</script>
```



# 4.Vue

## 4.1.Vue介绍

- Vue是一套前端框架,免除原生JavaScript中的DOM操作,简化了书写
- 基于MVVM(Model-View-ViewModel)思想,实现数据的双向绑定,将编程的重点关注点放在数据上
- 框架:是一个半成品软件,是一套可用的,通用的,软件基础代码模型,基于框架进行开发,更加快捷,更加高效  



## 4.2.Vue的使用

### 4.2.1.Vue的基本使用

- 新建HTML页面,引入vue.js文件

  ```js
  <script src = "js/vue.js"></script>
  ```

- 在JS区域,创建Vue核心对象,定义数据模型

  ```js
  <script>
    new Vue({
    el:"#app",
    data:{
      message:"Hello Vue!"
    }
  })
  </script>
  ```

- 编写视图

  ```js
  <div id="app">
    //v-mode数据模型
    <input type="text" v-model="message">
      {{message}}//插值表达式
  </div>
  ```

- 插值表达式

  - 形式:{{表达式}}

  - 内容:

    - 变量
    - 三元运算符
    - 函数调用
    - 算术运算

    


## 4.3.Vue常用指令

- 指令:HTML标签上带有V-前缀的特殊属性 不同指令具有不同的含义,例如:v-if,v-for…

- 常用指令

  | 指令      | 作用                                               |
  | --------- | -------------------------------------------------- |
  | v-bind    | 为HTML标签绑定属性值,如设置href,css样式等          |
  | v-model   | 为表单上创建双向数据绑定                           |
  | v-on      | 为HTML标签绑定事件                                 |
  | v-if      |                                                    |
  | v-else-if | 条件性的渲染某元素,判定为true时渲染,否则不渲染     |
  | v-else    |                                                    |
  | v-show    | 根据条件展示某元素,区别在于切换的是display属性的值 |
  | v-for     | 列表渲染,遍历容器或者对象的属性                    |

- v-bind

  ```js
  <a v-bind:href='url'>1234 </a>
  ```

  ```js
  <a :href='url'>1234</a>
  ```

- v-model

  ```js
  <input type="text" v-model="url">
  ```

  ```html
  <head>
      <script src="js/vue.js"></script>
  </head>
  <body>
      <!-- 接管区域 -->
      <div id="app">
          <a v-bind:href="url">链接1</a>
          <a :href="url">链接2</a>
          <input type="text" v-model="url">
      </div>
  </body>
  <script>
      new Vue({
          el:"#app",
          data:{
              url : "https://www.baidu.com"
          }
      })
  </script>
  ```

  **通过v-bind 或者 v-model绑定的变量,必须在数据模型中声明.**

- v-on

  ```html
  <input type="button" value="按钮" v-on:click="handle()">
  <input type="button" value="按钮" @click="handle()">
  ```

  ```js
  <script>
    new Vue({
    el:"#app",
    date:{
      //...
    },
    methods:{
      handle:function(){
        alert("被点击了")
      }
    },
  })
    </script>
  ```

- v-if

  ```js
  //年龄{{age}},经过判定为:
  <span v-if="age <= 35 ">young</span>
  <span v-else-if="age" > 35 && age < 60">adult</span>
  <span v-else>adult</span>
  ```
  
- v-show

  ```js
  //年龄{{age}},经判定:
  <span v-show="age <= 35">young</span>
  ```

  ```html
  <head>
    <script src="js/vue.js"></script>
  </head>
  <body>
    <div id="app">
        <!-- v-if -->
        <!-- 
            <span>young</span>
            <br>
            <br>
         -->
        年龄 <input type="text" v-model="age">经判断,为:
        <span v-if="age <= 35 ">young</span>
        <span v-else-if="age > 35 && age < 60">adult</span>
        <span v-else>old</span>
        <br> <br>
  
        <!-- v-show -->
      	年龄 <input type="text" v-model="age">经判断,为:
        <span v-show="age <= 35 ">young</span>
        <span v-show="age > 35 && age < 60">adult</span>
        <span v-show="age > 60">old</span>
        <br> <br>
        <!-- 
            <span style="">young</span>
            <span style="display: none;">adult</span>
            <span style="display: none;">old</span>
        -->
        
    </div>
  
  </body>
  <script>
    new Vue({
        el:"#app",
        data:{
            age:20
        },
        methods: {
  
        },
    })
  </script>
  ```

- v-for

  ```js
  <div v-for="addr in addrs">{{addr}}</div>
  //addr 为遍历出来的一个数 in 是一个关键字 addrs是要遍历的这个数组
  //{{addr}} 根据插值表达式将遍历的数展示出来
  ```

  ```js
  <div v-for="(addr,index) in addrs">{{index + 1}} : {{addr}}</div>
  //addr 遍历的元素 index是遍历的索引(从0开始)
  ```

  ```js
  data:{
    ...
    addrs:['beijing','shanghai']
  },
  ```

  ```html
  
  <head>
      <script src="js/vue.js"></script>
  </head>
  <body>
      <div id="app"  align = 'center'>
          <table border="1" cellspacing="0" width="60%" >
              <!-- 表头 -->
              <tr>
                  <th>编号</th>
                  <th>姓名</th>
                  <th>年龄</th>
                  <th>性别</th>
                  <th>成绩</th>
                  <th>等级</th>
              </tr>
              <!-- 静态数据 -->
  
              <tr align="center" v-for="(user, index) in users">
                  <td>{{index+1}} </td>
                  <td>{{user.name}} </td>
                  <td>{{user.age}} </td>
                  <td >
                      <span v-if="user.gender == 1">Man</span>
                      <span v-if="user.gender == 2">Woman</span>
                  </td>
                  <td>{{user.score}} </td>
                  <td>
                      <span v-if="user.score >= 85" >Good</span>
                      <span v-else-if="user.score >=60 ">Average</span>
                      <span style="color: red;" v-else >Bad!!</span>
                  </td>
              </tr>
          </table>
      </div>
  </body>
  <script>
      new Vue({
          el:"#app",
          data:{
              users:[{
                  name:"tom",
                  age:20,
                  gender:1,
                  score:99
              },{
                  name:"dick",
                  age:19,
                  gender:1,
                  score:88
              },{
                  name:"cock",
                  age:18,
                  gender:2,
                  score:33
              }]
          },
          methods: {
              
          },
      })
  </script>
  </html>
  ```



## 4.4.Vue生命周期

- 生命周期:指一个对象从创建到销毁的整个过程

- 生命周期的八个阶段:每次触发一个生命周期事件,会自动执行一个生命周期方法(钩子)

  | 状态          | 阶段周期 |
  | ------------- | -------- |
  | beforeCreate  | 创建前   |
  | created       | 创建后   |
  | beforeMount   | 挂载后   |
  | mounted       | 挂载完成 |
  | beforeUpdate  | 更新前   |
  | updated       | 更新后   |
  | beforeDestory | 销毁前   |
  | destoryed     | 销毁后   |

  ```js
  new Vue({
    el:"#app",
    data:{
      
    },
    mounted(){
      console.log("Vue挂载完毕,发送请求获取数据");
    },
    methods:{
      
    },
  })
  ```

- mounted:挂载完成,Vue初始化完成,,HTML页面渲染成功(发送请求到服务器,加载数据)





# 5.Web前端开发

## 5.1.Ajax

- 概念: Asynchronous JavaScript And XML ,异步的JavaScript和XML

- 作用:

  - 数据交互:通过Ajax可以给服务器发送请求,并获取服务器相应的数据
  - 异互交互:可以在**不重新加载整个页面**的情况下,**与服务器交换数据并更新部分网页的技术**,如:搜索联想,用户名是否可用的校验等等

- 同步与异步

  <a href="https://smms.app/image/T6Bh5yDnONQJWVY" target="_blank"><img src="https://s2.loli.net/2024/03/09/T6Bh5yDnONQJWVY.png" ></a>



## 5.2.原生Ajax

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>原生Ajax</title>
</head>
<body>

  <input type="button" value="获取数据" onclick="getData()">

  <div id="div1"></div>

</body>
<script>    
  function getData(){
      //1. 创建XMLHttpRequest 
      var xmlHttpRequest  = new XMLHttpRequest();

      //2. 发送异步请求
      xmlHttpRequest.open('GET','http://yapi.smart-xwork.cn/mock/169327/emp/list');
      xmlHttpRequest.send();//发送请求

      //3. 获取服务响应数据
      xmlHttpRequest.onreadystatechange = function(){
          if(xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){
              document.getElementById('div1').innerHTML = xmlHttpRequest.responseText;
          }
      }
  }
</script>
</html>
```

**原生Ajax比较繁琐,所以不使用**



## 5.3.Axios

http://www.axios-http.cn/

```html
<head>
  <title>Document</title>
  <script src="js/axios-0.18.0.js"></script>
</head>
<body>
  <input type="button" value="获取数据" onclick="get()">
  <input type="button" value="删除数据" onclick="post()">
</body>
<script>
  function get(){
      //通过axios发送异步请求-get
      axios({
          method:"get",
          url:"http://yapi.smart-xwork.cn/mock/169327/emp/list"
      }).then((result) => {
          console.log(result.data);
      })
  }
  
  function post(){
      axios({
          method:"get",
          url:"http://yapi.smart-xwork.cn/mock/169327/emp/deleteById",
          data:"id=1"
      }).then((result) => {
          console.log(result.data);
      })
  }

</script>
```

**过于繁琐,所以不使用**

- 请求方式别名

  - axios.get(url[,config])
  - axios.delete(url[,config])
  - axios.post(url[,data[,config]])
  - axios.put(url [,data[,config]])

- 发送GET请求

  ```js
  axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then((result)=>{
    console.log(result.data);
  });
  ```

- 发送POST请求

  ```js
  axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/deleteById","id=1").then((result)=>{
    console.log(result.data);
  });
  ```

  **比较简单,推荐使用**







## 5.4.前端工程化

### 5.4.1.Vue-cli

- 介绍:Vue-cli是Vue官方提供的一个脚手架,用于快速生成一个Vue的项目模版
- Vue-cli提供了如下功能:
  - 统一的目录结构
  - 本地调试
  - 热部署
  - 单元测试
  - 集成打包上线
- 依赖环境:NodeJS



## 5.4.2.Vue项目

<a href="https://smms.app/image/XkoJMW8Q1xz3EsP" target="_blank"><img src="https://s2.loli.net/2024/03/09/XkoJMW8Q1xz3EsP.png" ></a>

<a href="https://smms.app/image/uZDAvaUpf3Fe5hz" target="_blank"><img src="https://s2.loli.net/2024/03/09/uZDAvaUpf3Fe5hz.png" ></a>

- 启动Vue

  <a href="https://smms.app/image/1oQsp7tgbchTGVf" target="_blank"><img src="https://s2.loli.net/2024/03/09/1oQsp7tgbchTGVf.png" ></a>



- 更改端口号

  ```js
  const { defineConfig } = require('@vue/cli-service')
  module.exports = defineConfig({
    transpileDependencies: true,
    devServe:{
      port:7000,
    }
  })
  //vue.config.js
  ```

- 开发流程

  ```js
  import App from './App.vue'
  //从./App.vue导入
  //.vue结尾的文件为组件文件
  
  new Vue({
    router,
    render: h => h(App)
    //通过render创建一个虚拟的DOM元素 从APP传入
  }).$mount('#app')
  //Vue挂载到app上
  ```

  Vue的组件文件以.vue结尾,每个组件由三个部分组成:\<template>,\<script>,\<style>.

- \<template>:模版部分,由它生成HTML代码

- \<script>:控制模版的数据来源和行为

- \<style>:CSS的样式部分 

  <a href="https://smms.app/image/n5X7QrBTdgF6xWk" target="_blank"><img src="https://s2.loli.net/2024/03/09/n5X7QrBTdgF6xWk.png" ></a>

  ```html
  <template>
    <div>
      <h1>{{message}} </h1>
    </div>
  </template>
  <script>
  export default {
    //将定义的这部分 导出去
    data:function(){
      return{
        message:"Hello Vue"
      }
    },
    methods: {
      
    },
  }
  </script>
  <style>
      /* CSS的样式 */
  </style>
  ```





## 5.4.3.Element

### 5.4.3.1.Element介绍

- Element:是一套专门为开发者,设计师和产品经理准备的基于Vue2.0的桌面端组件库
- 组件:组成网页的部件,例如 超链接,按钮,图片,表格,表单,分页条等等.
- 官网:https://element.eleme.cn/#/zh-CNListener



### 5.4.3.2.Element的使用

- 安装ElementUI组件库(在当前工程的目录下),在命令行执行命令:

  `npm install element-ui@2.15.3`

- 引入ElementUI组件库

  ```main.js
  import ElementUI from 'element-ui';
  import 'element-ui/lib/theme-chalk/index.css';
  Vue.use(ElementUI);
  ```

- 到官网进行复制到ElementView.vue中

- 在App.vue使用\<element-view>\</element-view>进行导入





### 5.4.3.3.Element常见组件

- 表格Table:用于展示多条结构类似的数据,可对数据进行排序,筛选,对比等其他自定义操作.
- 分页组件:Pageination:当数据过多时,使用分页分解数据





## 5.5.Vue路由组件

- 介绍:Vue Router 是Vue的官方路由

- 组成:
  - VueRouter:路由器类,根据路由请求在路由视图中动态渲染选中的组件
  - \<router-link>:请求链接组件,浏览器会解析成\<a>
  - \<router-view>:动态视图组件,用来渲染展示与路由路径对应的组件
  
- 步骤:

  - main.js导入router

  - router/index.js

    ```js
    import Vue from 'vue'
    import VueRouter from 'vue-router'
    // import HomeView from '../views/HomeView.vue'
    
    Vue.use(VueRouter)
    
    const routes = [
      {
        //如果访问地址是后面是/ 代码要访问HomeView
        path: '/blog',
        name: 'home',
        component:  () => import( '../views/blogs/BlogView.vue')
      },
      {
        //如果要范围更about 后面是/about
        path: '/about',
        name: 'about',
        component: () => import( '../views/AboutView.vue')
      },
      {
        path:'/',
        redirect: '/blog'
        //如果是 / 直接访问到/blog
      }
    ]
    
    const router = new VueRouter({
      routes
    })
    
    export default router
    
    ```





## 5.6.Nginx部署

<a href="https://smms.app/image/jQ1UBS6yGf7J5ra" target="_blank"><img src="https://s2.loli.net/2024/03/11/jQ1UBS6yGf7J5ra.png" ></a>

- 部署:将打包好的dist目录下的文件复制到nginx安装的目录下
- 启动:双击nginx.exe文件,Nginx服务器默认占用80 端口 需要我们去更改端口号 
- 可以在nginx.conf中修改端口号,(netstat -ano | findStr 80)







# 6.Maven

## 6.1.Maven简介



- Maven是apache旗下的一个开源的项目,**是一款用于管理和构建java项目的工具**

- 作用:

  - 方便的依赖管理
  - 同一的项目结构
  - 标准的项目构建流程

- Apach Maven 是一个项目管理和构建工具,它基于项目对象模型POM(project object model)的概念,通过一小段描述信息来管理项目的构建

  <a href="https://smms.app/image/eZ4FMC89uGInjDv" target="_blank"><img src="https://s2.loli.net/2024/03/11/eZ4FMC89uGInjDv.png" ></a>

- 仓库:用于存储资源,管理各种jar包

  - 本地仓库:自己计算机的目录
  - 中央仓库:由Maven团队维护的唯一的
  - 远程仓库(私有):一般由公司团队搭建的私有仓库
  - 查找jar包的顺序:本地仓库 > 远程仓库(有私有仓库才行) > 中央仓库

- 安装Maven:

  - 解压Maven包
  - 配置本地仓库
  - 配置阿里云私服
  - 配置环境变量

- 坐标:

  - Maven中的坐标是资源的唯一标识,通过该坐标可以唯一定位资源位置

  - 使用坐标来定义项目或引入项目中需要的依赖
  
- Maven坐标的主要组成

  - groupld:定义当前Maven项目隶属组织名称(通常是域名反写,例如:com.itheima)

  - artifactld:定义当前Maven项目名称(通常是模块名称)

  - version:定义当前项目版本号

    ```xml
    <groupId>org.example</groupId>
    <artifactId>maven_javaweb</artifactId>
    <version>1.0-SNAPSHOT</version>
    ```

- IDEA导入Maven项目

  - 打开IDEA,选择右侧Maven面板,点击+号,选中对应项目的pom.xml文件,双击即可

## 6.2.依赖管理

### 6.2.1.依赖配置

- 依赖:指当前项目运行所要的jar包,一个项目中可以引入多个依赖

- 配置:

  1. 在pom.xml中编写\<dependencies>标签

  2. 在\<dependencies>标签中使用\<dependency>引入坐标

  3. 定义坐标的grouped,artifactId,version

  4. 点击刷新按钮,引入最新加入的坐标(点击加载按钮 重新刷新)

     ```xml
     <dependencies>
         <dependency>
             <groupId>ch.qos.logback</groupId>
             <artifactId>logback-classic</artifactId>
             <version>1.2.11</version>
         </dependency>
     </dependencies>
     ```

     [Maven Repository: Search/Browse/Explore (mvnrepository.com)](https://mvnrepository.com/)



### 6.2.2.依赖传递

- 依赖具有传递性

  - 直接依赖:在当前项目中通过依赖配置建立的依赖关系

  - 间接依赖:被依赖的资源如果依赖其他资源,当前项目间接依赖其他资源

    <a href="https://smms.app/image/FItxY2doZK9CM8A" target="_blank"><img src="https://s2.loli.net/2024/03/12/FItxY2doZK9CM8A.png" ></a>

- 排除依赖:

  - 排除依赖指主动断开的资源,被排除的资源无需指定版本

    ```xml
    <dependency>
    	<groupId>com.itheima</groupId>
      <artifactId>maven-projectB</artifactId>
      <version>1.0-SNAPSHOT</version>
      <exclusions>
      	<exclusion>
        	<groupId>junit</groupId>
          <artifactId>junit</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    ```



### 6.2.3.依赖范围

- 依赖的jar包,默认情况下,可以在任何地方使用,可以通过\<scope>…\</scope>设置其作用范围

- 作用范围:

  - 主程序范围有效.(main文件范围内)
  - 测试程序范围有效.(test文件范围内)
  - 是否参与打包运行.(package指令范围内)

  |    scope值    | 主程序 | 测试程序 | 打包(运行) |    范例     |
  | :-----------: | :----: | :------: | :--------: | :---------: |
  | compile(默认) |   Y    |    Y     |     Y      |    log4j    |
  |     test      |   -    |    Y     |     -      |    junit    |
  |   provided    |   Y    |    Y     |     -      | servlet-api |
  |    runtime    |   -    |    Y     |     Y      |  jdbc驱动   |





### 6.2.4.生命周期

- Maven的生命周期就是为了对所有的maven项目构建过程进行**抽象和统一**

- Maven中有三套相互独立的生命周期:

  - **clean:清理工作**
  - **default:核心工作,如:编译,测试,打包,安装,部署等**
  - **site:生成报告,发布站点等**

- 生命周期阶段:

  - clean:移除上一次构建生成的文件
  - compile:编译项目源代码
  - test:使用合适的单元测试框架运行测试(junit)
  - package:将编译后的文件进行打包,如:jar.war等
  - install:安装项目到本地仓库

- 在**同一套生命周期**中,当运行到后面阶段时,前面的阶段都会运行

  例如:运行package时候,前面的compile也会运行,但是clean不会运行,因为他们不是同一套生命周期

- 运行指定的生命周期:

  - IDEA右侧maven工具,进行选择
  - 在命令行中运行,例如:mvn clean





## 6.3.*Maven高级

### 6.3.1.分模块设计与开发

- 什么是分模块设计?

  将项目**按照功能拆分成若干的子模块**

- 为什么要分模块设计

  方便项目的管理维护,扩展,也方便模块间的相互调用,资源共享

- 注意:

  分模块设计需要先针对模块功能进行设计,再进行编码,不会先将工程开发完毕,然后进行拆分

  ![image.png](https://s2.loli.net/2024/03/22/qoZaLwmp3ryOGSC.png)

**拆分成各个模块,使用的时候,直接通过依赖导入即可**



### 6.3.2.继承与聚合

- 继承

  - 概念:继承描述的是俩个工程间的关系,与java中的继承相似,子工程可以继承父工程中的配置信息,常见于依赖关系的继承

  - 作用:简化依赖配置,统一管理依赖

  - 实现:`<parent>...</parent>`

    ```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.5</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    ```

    ![image.png](https://s2.loli.net/2024/03/22/8viTcYEAHkM5jXR.png)

  -  继承关系的实现

    **只能单继承,可以实现双重继承,既A继承parent工程,B继承A**

    1. 创建maven工程模块tlias-parent,**该工程为父工程,设置打包方式为pom**(默认为jar)

       jar:普通模块打包,springboot项目基本都是jar包(内嵌tomcat服务器)

       war:普通的web程序打包,需要部署在外部的tomcat服务器中运行

       pom:父工程或聚合工程,该模块不写代码,只进行依赖管理

       ```xml
       <parent>
       <!-- 父工程坐标-->
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>2.7.5</version>
         <relativePath/> <!-- 父工程的相对路径  (默认从本地仓库来查找)-->
         <!-- The relative path of the parent &lt;code&gt;pom.xml&lt;/code&gt; file within the check out.
                   If not specified, it defaults to &lt;code&gt;../pom.xml&lt;/code&gt;.
       	也就是如果没有配置父工程的相对路径 父工程会返回上一级目录 然后查找上一级目录的pom.xml文件 作为父工程的pom文件
       	-->
       </parent>
       
       <groupId>com.it117</groupId>
       <artifactId>tlias-parent</artifactId>
       <version>1.0-SNAPSHOT</version>
       <packaging>pom</packaging> 
       <!-- 打包方式为pom-->
       ```

    2. 在子工程的pom.xml文件中,配置继承关系

       ```xml
       <parent>
               <groupId>com.it117</groupId>
               <artifactId>tlias-parent</artifactId>
               <version>1.0-SNAPSHOT</version>
               <relativePath>../tlias-parent/pom.xml</relativePath>
       </parent>
       <!-- <groupId>com.it117</groupId>  由于继承机制 所以不需要这个groupid-->
       <artifactId>tlias-pojo</artifactId>
       <version>1.0-SNAPSHOT</version>
       ```

    3. 在父工程中配置各个工程共有的依赖(子工程会自动继承父工程的依赖)

       <img src="https://s2.loli.net/2024/03/22/UOB7dMHaf12JXEe.png" alt="image.png" style="zoom:50%;" />

- 版本锁定(Maven提供的)

  - 可以在父工程的pom文件中通过\<dependencyManagement>来统一管理依赖版本
  
    \<dependencyManagement>只是统一管理依赖的版本, 并不是直接加入了这些依赖
  
    ```xml
    <!-- 父工程-->
    <dependencyManagement>
    	<dependencies>
        <!--lombok-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
            <version>1.18.24</version>
        </dependency>
    	</dependencies>
    </dependencyManagement>
    ```
  
    ```xml
    <!-- 子工程-->
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
          <!-- 不需要再输入版本号了 父工程已经锁定了-->
        </dependency>
    </dependencies>
    ```
  
    **子工程引入依赖时,无需锁定\<version>版本号,父工程统一管理,需要变更依赖版本时,只需要在父工程统一变更**
  
    ```xml
    <properties>
        <!--   默认属性 指定JDK版本的-->
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <lombok.version>1.18.24</lombok.version>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
    
    <dependencyManagement>
        <dependencies>
            <!--lombok-->
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <optional>true</optional>
                <version>${lombok.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
    ```
  
    **在springboot中 已经对web起步依赖的版本进行了统一的管理 **
  
  - **\<dependencyManagement>和\</dependencies>的区别**
  
    1. **\<dependencyManagement>是统一管理依赖版本,不会直接依赖,还需要在子工程中引入所需依赖(无需指定版本)**
    2. **\</dependencies>是直接依赖,在父工程配置了依赖,子工程会直接继承下来**
  
- 聚合

  - 普通的执行打包过程 需要将工程下的调用的jar包全部安装到本地仓库再打包才能成功,过程比较繁琐(工程文件打包时,寻找jar包去本地仓库规定的地方寻找jar包 如果没有 需要将自定义的jar包安装到本地仓库规定的位置下 才能继续进行打包)
  - 聚合功能实现 一键编译 一键打包 一键安装等等
  - 概念:将多个模块组织在一起,同时进行项目的构建
  - 聚合工程:一个不具有业务功能的“空”工程(有且仅有一个pom工程) (我们自定义的父工程 其实也是聚合工程)
  - 作用:快速构建项目(无需根据依赖关系手动构建,直接在聚合工程上构建即可)
  - **每个模块的打包都放在当前的target的目录下了**

- 继承与聚合

  - 作用
    1. 聚和用于快速构建项目
    2. 继承用于简化依赖配置,统一管理依赖
  - 相同点
    1. 聚合与继承的pom的xml文件打包方式均为pom,**可以将俩种关系制作到同一个pom文件中**
    2. 聚和与继承均属于设计型模块,**并无实际的模块内容**
  - 不同点
    1. 聚合是在聚合工程中配置关系,**聚合可以感知到参与聚合的模块有哪些**
    2. 继承是在子模块中配置关系,**父模块无法感知哪些子模块继承了自己**



### 6.3.3.私服

- 私服是一种特殊的远程仓库,它是架设在局域网内的仓库服务,用来代理位于外部的中央仓库,用于解决团队内部的资源共享与资源同步问题

  <img src="https://s2.loli.net/2024/03/22/PUKtWxdyvn2ag5m.png" alt="image.png" style="zoom: 67%;" />

- 依赖查找的顺序:

  **本地仓库 > 私服 > 中央仓库**

- 资源的上传与下载

  - 仓库有三个版本: **release snapshot central**

    1. RELEASE(发行版本):功能趋于稳定,当前更新停止,可以用于发行的版本,存储在私服中的RELEASE仓库
    2. SNAPSHOT(快照版本):功能不稳定,尚处于开发中的版本,既快照版本,存储在私服的SNAPSHOT仓库中
    3. `<version>0.0.1-SNAPSHOT</version>`为快照版本
    4. `<version>0.0.1</version>`为正式版本

  - 步骤:

    1. 设置私服的用户名和密码(settings.xml 中的servers中配置)

       ```xml
       <server>
       <id>maven-release</id>
       <username>admin</username>
       <password>123456</password>
       </server>
       
       <server>
       <id>maven-snapshots</id>
       <username>admin</username>
       <password>123456</password>
       </server>
       ```

    2. 配置IDEA中的maven工程的pom文件中配置上传(发布)地址

       ```xml
       <distributionManagement>
       	<repository>
         	<id>maven-releases</id>
           <url>http://192.168.0.1/repository/maven-release/</url>
         </repository>
         
         <snapshotsRepository>
         	<id>maven-snapshots</id>
           <url>http://192.168.0.1/repository/maven-snapshots/</url>
         </snapshotsRepository>
       </distributionManagement>
       ```

       **私服设置的\<server>中的`<id>maven-snapshots</id>`必须和 \<snapshotsRepository>中的\<id>maven-snapshots\</id>一致**
         	

    3. 设置私服依赖的下载的仓库组地址(settings.xml的mirrors,profiles中配置)

       ```xml
       <mirror>
         <id>alimaven</id>
         <name>aliyun_maven</name>
         <url>https://maven.aliyun.com/repository/public</url>
         <mirrorOf>central</mirrorOf>
       </mirror>
       ```

       ![image.png](https://s2.loli.net/2024/03/22/B2meDTsFVLZ79cj.png)







# 7.Web后端开发

## 7.1.Spring快速入门

**Spring Boot是由Pivotal团队提供的一套开源框架，可以简化spring应用的创建及部署。它提供了丰富的Spring模块化支持，可以帮助开发者更轻松快捷地构建出企业级应用。Spring Boot通过自动配置功能，降低了复杂性，同时支持基于JVM的多种开源框架，可以缩短开发时间，使开发更加简单和高效。**

- 创建SpringBoot工程,填写模块信息,并勾选web开发相关的依赖
- 创建请求处理类HelloController,添加请求处理方法hello,并添加注释
- 运行启动类,打开浏览器测试,并自动占用当前端口的8080  





## 7.2.HTTP协议

### 7.2.1.HTTP概述

- HTTP(Hyper Text Transfer Protocol) 超文本传输协议,规定了浏览器和服务器之间**数据传输的规则**
- 特点:
  1. 基于TCP协议:面向连接,安全
  2. 基于请求-响应模型的:一次请求对应一次响应
  3. HTTP协议是无状态的协议:对于事务处理没有记忆能力,每次请求,响应都是独立的
     - 缺点:多次请求间不能共享数据
     - 优点:速度快



### 7.2.2.HTTP请求协议

- 请求行:请求数据的第一行(请求方式,资源路径,协议)

- 请求头:第二行开始,格式key:value

- 请求体:POST请求,存放请求参数

  ```http
  {"status":1,"brandName":"123"}
  ```

  ```http
  // /hello 请求的资源路径 
  // HTTP/1.1 协议及协议的版本
  GET /hello HTTP/1.1
  Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
  Accept-Encoding: gzip, deflate, br
  Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
  Cache-Control: max-age=0
  Connection: keep-alive
  DNT: 1
  Host: localhost:8080
  Sec-Fetch-Dest: document
  Sec-Fetch-Mode: navigate
  Sec-Fetch-Site: none
  Sec-Fetch-User: ?1
  Upgrade-Insecure-Requests: 1
  User-Agent: Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Mobile Safari/537.36 Edg/122.0.0.0
  sec-ch-ua: "Chromium";v="122", "Not(A:Brand";v="24", "Microsoft Edge";v="122"
  sec-ch-ua-mobile: ?1
  sec-ch-ua-platform: "Android"
  ```

  | host            | 请求的主机名                                           |
  | --------------- | ------------------------------------------------------ |
  | User-Agent      | 浏览器的版本                                           |
  | Accept          | 表示浏览器能接收的资源类型,如:text/*,image/\*或者\*/\* |
  | Accept-Language | 表示浏览器偏好的语言,服务器可以根据此不同语言的网页    |
  | Content-Type    | 请求主体的数据                                         |
  | Content-Length  | 请求主体的大小(单位:字节).                             |

- 请求方式

  - GET:请求参数在请求行中,没有请求体,如:/brand/findAll?name=oppo&status=1.GET请求大小是有限制的
  - POST:请求参数在请求体中,POST请求大小是没有限制的









### 7.2.3.HTTP响应格式

```http
HTTP/1.1 200 OK
content-type: text/html
server: IntelliJ IDEA 2023.3.4
date: Tue, 12 Mar 2024 12:33:29 GMT
x-frame-options: SameOrigin
X-Content-Type-Options: nosniff
x-xss-protection: 1; mode=block
accept-ranges: bytes
cache-control: no-cache
last-modified: Tue, 14 Mar 2023 07:02:34 GMT
content-length: 627
access-control-allow-origin: http://localhost:63342
vary: origin
access-control-allow-credentials: true
```

- 响应行(第一行):响应数据第一行(协议,状态码,描述)
- 响应头:第二行开始,格式key:value
- 响应体:最后一部分,存放响应数据

<a href="https://smms.app/image/J4Udkuyv6EtTzVp" target="_blank"><img src="https://s2.loli.net/2024/03/12/J4Udkuyv6EtTzVp.png" ></a>

| 状态码分类 | 说明                                                         |
| ---------- | ------------------------------------------------------------ |
| 1xx        | **响应中**——临时状态码，表示请求已经接受，告诉客户端应该继续请求或者如果它已经完成则忽略它 |
| 2xx        | **成功**——表示请求已经被成功接收，处理已完成                 |
| 3xx        | **重定向**——重定向到其它地方：它让客户端再发起一个请求以完成整个处理。 |
| 4xx        | **客户端错误**——处理发生错误，责任在客户端，如：客户端的请求一个不存在的资源，客户端未被授权，禁止访问等 |
| 5xx        | **服务器端错误**——处理发生错误，责任在服务端，如：服务端抛出异常，路由出错，HTTP版本不支持等 |

| 状态码  | 英文描述                               | 解释                                                         |
| ------- | -------------------------------------- | ------------------------------------------------------------ |
| ==200== | **`OK`**                               | 客户端请求成功，即**处理成功**，这是我们最想看到的状态码     |
| 302     | **`Found`**                            | 指示所请求的资源已移动到由`Location`响应头给定的 URL，浏览器会自动重新访问到这个页面 |
| 304     | **`Not Modified`**                     | 告诉客户端，你请求的资源至上次取得后，服务端并未更改，你直接用你本地缓存吧。隐式重定向 |
| 400     | **`Bad Request`**                      | 客户端请求有**语法错误**，不能被服务器所理解                 |
| 403     | **`Forbidden`**                        | 服务器收到请求，但是**拒绝提供服务**，比如：没有权限访问相关资源 |
| ==404== | **`Not Found`**                        | **请求资源不存在**，一般是URL输入有误，或者网站资源被删除了  |
| 405     | **`Method Not Allowed`**               | 请求方式有误，比如应该用GET请求方式的资源，用了POST          |
| 428     | **`Precondition Required`**            | **服务器要求有条件的请求**，告诉客户端要想访问该资源，必须携带特定的请求头 |
| 429     | **`Too Many Requests`**                | 指示用户在给定时间内发送了**太多请求**（“限速”），配合 Retry-After(多长时间后可以请求)响应头一起使用 |
| 431     | **` Request Header Fields Too Large`** | **请求头太大**，服务器不愿意处理请求，因为它的头部字段太大。请求可以在减少请求头域的大小后重新提交。 |
| ==500== | **`Internal Server Error`**            | **服务器发生不可预期的错误**。服务器出异常了，赶紧看日志去吧 |
| 503     | **`Service Unavailable`**              | **服务器尚未准备好处理请求**，服务器刚刚启动，还未初始化好   |

状态码大全：https://cloud.tencent.com/developer/chapter/13553 





## 7.3.Tomcat

### 7.3.1.Tomcat概念

- 概念:Tomcat是Apache软件基金会一个核心项目,是一个开源免费的轻量级web服务器,支持Servlet/JSP少量javaEE规范

- JavaEE:Java Enterprise Edition,Java企业版,指Java企业级开发的技术规范总和,包括13项技术规范:JDBC,JNDI,EJB,RMI,JSP,Servlet,XML,Java IDL, JTS, JTA,JavaMail,JAF

- Tomcat也被称为Web容器,Servlet容器,**Servlet程序需要依赖于Tomcat才能运行**

  **Tomcat不识别Spring程序,但能识别Servlet程序**



### 7.3.2.Tomcat基本使用

<a href="https://smms.app/image/7GXlLSKeuFoZ1f9" target="_blank"><img src="https://s2.loli.net/2024/03/12/7GXlLSKeuFoZ1f9.png" ></a>

- 启动:双击 bin\startup.bat

  ```java
  java.util.logging.ConsoleHandler.level = FINE
  java.util.logging.ConsoleHandler.formatter = org.apache.juli.OneLineFormatter
  java.util.logging.ConsoleHandler.encoding = GBK
  //控制台中文乱码 修改conf/logging.properties
  ```

- 关闭:

  1. 直接关闭窗口:强制关闭
  2. bin\shutdown.bat:正常关闭
  3. Ctrl+C:正常关闭

- 问题:

  - 启动窗口一闪而过,检查JAVA_HOME环境变量是否正常配置
  - 端口号冲突:找到对应程序,将其关掉

- 配置Tomcat端口号(conf/server.xml)

  ```xml
  <Connector port="8080" protocol="HTTP/1.1"
                 connectionTimeout="20000"
                 redirectPort="8443"
                 maxParameterCount="1000"
                 />
  ```

  **HTTP协议默认端口号为80,如果将Tomcat端口号改为80,则将来访问Tomcat时,不需要输入端口号**

- Tomcat部署项目:将项目放在webapps目录下,既部署完成



## 7.4.SpringBoot解析

- 起步依赖:

  - **spring-boot-starter-web:包含了web应用开发所需要的常见依赖(web环境中自动添加Tomcat服务器,内嵌的Tomcat服务器)**

  - spring-boot-starter-test:包含单元测试所需要的常见依赖

  - 起步依赖不需要直接去定义一个版本,因为他们都继承了父工程,而这个父工程中统一管理了这个起步依赖的版本

    ```xml
    <parent>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-parent</artifactId>
      <version>3.2.3</version>
      <relativePath/> <!-- lookup parent from repository -->
    </parent>
    ```

- **基于SpringBoot开发的web应用程序,内置了Tomcat服务器,当启动类运行时,会自动启动内嵌的Tomcat服务器**







## 7.5.请求响应

- Tomcatweb服务器不能直接识别XXXController程序,但是识别Servlet程序,SpringBoot底层提供了一个DispatcherServlet程序,这个DispatcherServelet程序,前端发送的请求会先给DispathcerServlet程序,再转给XXXController程序,Controller程序处理完请求之后,返回给DispathcerServelet,再返回给浏览器
-  DispatcherServlet(前端控制器):接受服务器发送的请求,解析之后,从前端控制器中的HttpServletRequest进行解析,由HttpServeletResponse响应数据给浏览器
- 请求(HttpServletRequest):获取请求数据
- 响应(HttpServeletResponse):设置响应数据
- BS架构:Browser/Server,浏览器/服务器架构模式.客户端只需要浏览器,应用程序的逻辑和数据都存储在服务器
- CS架构:Client/Server,客户端/服务器架构模式(单独安装客户端)



### 7.5.1.请求参数

- PostMan:是一款功能强大的网页调试与发送网页HTTP请求的Chrome插件
  - 作用:用于进行接口测试

### 7.5.2.简单参数

- 原始方式:在原始的web程序中,获取请求参数,需要通过HttpServeletRequest对象进行手动获取

  ```java
  @RestController
  public class RequestController {
      @RequestMapping("/simpleParam")
      public String simpleParam(HttpServletRequest request){
          String name = request.getParameter("name");
          String ageStr = request.getParameter("age");
  
          int age = Integer.parseInt(ageStr);
          System.out.println(name+":"+age);
          return "OK";
      }
  }
  ```

- SpringBoot方式

  - 简单参数:参数名与形参变量名相同,定义形参即可接受参数

    ```java
    @RestController
    public class RequestController {
        @RequestMapping("/simpleParam")
        public String simpleParam(String name, Integer age){
            System.out.println(name+":"+age);
            return "OK";
        }
    }
    ```

  - 如果方法形参与请求参数名称不匹配,可以使用**@RequestParam完成映射**

    ```java
    @RestController
    public class RequestController {
      @RequestMapping("/simpleParam")
      public String simpleParam(@RequestParam(name = "name") String username, Integer age){
          System.out.println(username+":"+age);
          return "OK";
      }
    }
    ```

  - @RequestParam中的required属性默认为true,代表该请参数必须传递,如果不传递将报错,如果该参数是可选的,可以将required属性设置为false

    ```java
    @RestController
    public class RequestController {
      @RequestMapping("/simpleParam")
      public String simpleParam(@RequestParam(name = "name",,required = false) String username Integer age){
          System.out.println(username+":"+age);
          return "OK";
      }
    }
    ```

### 7.5.3.实体参数

- 简单实体对象:请求参数名与形参对象属性名相同,定义POJO接受即可

  ```java
  @RequestMapping("/simplePojo")
      public String simplePojo(User user){
          System.out.println(user);
          return "ok";
      }
  ```

- 复杂实体对象:请求参数名与形参对象属性名相同,安装对象层次结构关系即可接受嵌套POJO属性参数

  ```java
  @RequestMapping("/complexPojo")
      public String complexPojo(User user){
          System.out.println(user);
          return "ok";
      }
  ```



### 7.5.4.数组集合参数

- 数组参数:请求参数名与形参数组名称相同且请求参数为多个,定义数组类型形参即可接受参数

  <a href="https://smms.app/image/pFQHXj5t1nEbGqB" target="_blank"><img src="https://s2.loli.net/2024/03/13/pFQHXj5t1nEbGqB.png" ></a>

  ```java
  //使用数组来接受
  @RequestMapping("/arrayParam")
  public String arrayParam(String[] hobby){
      System.out.println(Arrays.toString(hobby));
      return "ok";
      //[game, girl, food]
  }
  
  //使用集合来接受
  //默认接受为数组
  //需要加上@RequestParam
  
  @RequestMapping("/listParam")
  public String listParam(@RequestParam List<String> hobby){
      System.out.println(hobby);
      return "ok";
      //[1, 2, 3, 4]
  }
  ```

- 数组:请求参数名与形参中数组变量名相同,可以**直接使用数组封装**

- 集合:请求参数名与形参中集合变量名相同,通过**@RequestParam绑定参数关系**





### 7.5.4.日期参数

- 日期参数**:使用@DataTimeFormat注解完成日期参数格式转换**

  ```java
  @RequestMapping("/dateParam")
  public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
      System.out.println(updateTime );
      return "ok";
      //2024-03-13T11:28:56
  }
  ```





### 7.5.6.JSON参数

- POST请求,JSON是放在请求体中

- JSON参数:JSON数据键名与形参对象属性名相同,定义POJO类型形参即可接受参数,需要使用**@RequestBody标识**

  ```java
  @RequestMapping("/jsonParam")
  public String jsonParam(@RequestBody User user){
      System.out.println(user);
      return "ok";
      //User{name='Dick', age=25, address=Address{province='beijing', city='shanghai'}}
  }
  ```

  ```json
  {
      "name":"Dick",
      "age":25,
      "address":{
          "province":"beijing",
          "city":"shanghai"
      }
  }
  ```





### 7.5.7.路径参数

- 路径参数:通过请求URL直接传递参数,使用{….}来标识该路径参数,需要使用**@PathVariable获取路径参数**

  ```java
  //路径参数
  //1.
  @RequestMapping("/path/{id}")
  public String pathParam(@PathVariable Integer  id){
      System.out.println(id);
      return "ok";
  }
  
  //2.
  @RequestMapping("/path/{id}/{name}")
  public String pathParam2(@PathVariable Integer  id,@PathVariable String name){
      System.out.println(id+" "+name);
      return "ok";
  }
  //依次绑定参数
  ```







## 7.6.设置响应

### 7.6.1.响应数据

```java
@RequestMapping("/path/{id}/{name}")
public String pathParam2(@PathVariable Integer  id,@PathVariable String name){
    System.out.println(id+" "+name);
    return "ok";
}
//返回了一个字符串 作为响应数据直接传递给客户端
```

- ResponseBody

  - 类型:方法注解,类注解

  - 位置:Controller方法上/类上

  - 作用:将方法返回值直接响应,如果返回值类型是 **实体对象/集合,将会转换为JSON格式响应再响应数据**

  - 说明:@RestController = @Controller + @ResponseBody;

    ```java
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    //上面称为元注解 也叫自定义注解
    @Controller
    @ResponseBody
    //@RestControlle
    //
    public @interface RestController {
        @AliasFor(
            annotation = Controller.class
        )
        String value() default "";
    }
    ```

- 功能接口

  ```java
  @RequestMapping("/hello")
  public String hello(){
      System.out.println("hello world");
      return "Hello world";
      //作为响应体 返回数据
  }
  //这就是一个功能接口
  
  ```





### 7.6.2.统一响应结果

- 规定响应的结果 便于项目管理和维护

```java
public class Result{
  //code为响应码 1代表成功 0代表失败
  private Integer code;
  //提示信息
  private String msg;
  //返回数据
  private Object data;
  /......
}
```

```java
@RequestMapping("/hello")
public String hello(){
    System.out.println("hello world");
    return "Hello world";
    //作为响应体 返回数据
}

@RequestMapping("/getAddr")
public Address getAddr(){
    Address addr = new Address();
    addr.setProvince("shanghai");
    addr.setProvince("beijing");
    return addr;
}

@RequestMapping("/listArr")
public List<Address> addressList(){
    ArrayList<Address> addresses = new ArrayList<>();

    Address addr = new Address();
    addr.setProvince("shanghai");
    addr.setProvince("beijing");

    Address addr2 = new Address();
    addr.setProvince("shanghai1");
    addr.setProvince("beijing2");

    addresses.add(addr);
    addresses.add(addr2);
    return addresses;

}

@RequestMapping("/hello")
public Result hello(){
    System.out.println("hello world");
//        return new Result(1,"success","Hello world");
    return Result.success("hello world");
    //作为响应体 返回数据

    //{   json格式
    //    "code": 1,
    //    "msg": "success",
    //    "data": "hello world"
    //}
}

@RequestMapping("/getAddr")
public Result getAddr(){
    Address addr = new Address();
    addr.setProvince("shanghai");
    addr.setProvince("beijing");
    return Result.success(addr);
}

@RequestMapping("/listArr")
public Result addressList(){
    ArrayList<Address> addresses = new ArrayList<>();

    Address addr = new Address();
    addr.setProvince("shanghai");
    addr.setCity("beijing");

    Address addr2 = new Address();
    addr2.setProvince("shanghai1");
    addr2.setCity("beijing2");

    addresses.add(addr);
    addresses.add(addr2);
    return Result.success(addresses);

    //{ json格式
    //    "code": 1,
    //    "msg": "success",
    //    "data": [
    //        {
    //            "province": "shanghai",
    //            "city": "beijing"
    //        },
    //        {
    //            "province": "shanghai1",
    //            "city": "beijing2"
    //        }
    //    ]
    //}
}
```



**SpringBoot项目的静态资源(html,css,js等前端资源>默认存放目录为:classpath:/static,classpath:/public,classpath:/resources**









## 7.7.分层解耦

### 7.7.1.三层架构

- Controller:控制层,接受前端发送的请求,对请求进行处理,并响应数据
- Service:业务逻辑层,处理具体的业务逻辑
- Dao:数据访问层(Data Access Object)(持久层),负责数据访问操作,包括数据的增删改查
- Controller ->Service ->Dao



### 7.7.2.分层解耦

- 内聚:软件中各个功能模块内部的功能联系

- 耦合:衡量软件中各个层/模块之间的依赖,关联程度

- 软件设计原则:高内聚低耦合

  <a href="https://smms.app/image/O58379cUFpkeIwt" target="_blank"><img src="https://s2.loli.net/2024/03/13/O58379cUFpkeIwt.png" ></a>

  

- 控制反转:Inversion Of Control 简称IOC,**对象的创建控制权由程序自身转移到外部(容器),这种思想称为控制反转**
- 依赖注入:Dependency Injection 简称DI,**容器为应用程序提供运行时,所依赖的资源**,称之为依赖注入
- Bean对象:**IOC容器中创建,管理的对象,称之为Bean.**



### 7.7.3.IOC和DI

- Severice层及Dao层的实现类,交给IOC容器管理
- 为Controller及Service注入运行时,依赖的对象
- 运行测试

- 步骤:

  1. Service层及Dao层的实现类,交给IOC容器管理
  2.  为Controller及Service注入运行时依赖的对象

  ```java
  @Component //表示当前类交给IOC管理
  public class EmpDaoA implements EmpDao {
  @Override
  public List<Emp> listEmp() {
      String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();
    	//获取文件路径
      System.out.println(file);
      List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
      return empList;
  }
  }
  ```

  ```java
  @RestController
  public class EmpController {
  		@Autowired //运行时 IOC容器会提供该类型的bean对象,并赋值给该变量 --依赖注入
  		private EmpService empService;
  		@RequestMapping("/listEmp")
  		public Result list(){
  
      List<Emp> empList = empService.listEmp();
      //响应数据
      return Result.success(empList);
  	}
  }
  ```

  **要切换相应的bean对象 只需要将Component注释掉就行**

  

  

### 7.7.4.IOC详解

- Bean对象说明:要把某个对象交给IOC容器管理,需要在对应的类上加入如下的注释:

  | 注释        | 说明                 | 位置                                         |
  | ----------- | -------------------- | -------------------------------------------- |
  | @Component  | 声明bean的基础注解   | 不属于以下三类时,用此注解                    |
  | @Controller | @Component的衍生注解 | 标注在控制器上                               |
  | @Service    | @Component的衍生注解 | 标注在业务类上                               |
  | @Repository | @Component的衍生注解 | 标注在数据访问类上(用于与mybatis整合,用的少) |

  **RestController是Controller的衍生类,所以不需要再添加Controller**

  ```java
  @Repository(value = "daoA") // 指定这个bean的名字
  //默认为是将类的名字的首字母小写
  ```

- 声明bean的时候,可以通过value属性指定bean的名字,如果没有指定,默认为类名首字母小写(例如“EmpDao = > empDao”)

- 使用以上四个注解都可以声明bean,但是在springboot集成web开发中,声明控制器bean只能用@Controller



- Bean组件扫描

  - 前面声明Bean的四大注解,要想生效,还需要被组件扫描注解@ComponentScan扫描
  - @ComponentScan注解虽然没有显示配置,但是实际上已经包含在了启动器声明注解@SpringBootApplication中,默认扫描的范围是**启动类所在包及其子包**(如果移动Bean注解的包,可能会造成无法查询到该Bean注解的包)

- 解决扫描的问题:

  ```java
  @ComponentScan({"dao","com.it117.spring_boot_web_req_resp"})
  @SpringBootApplication
  public class SpringBootWebReqRespApplication {
      public static void main(String[] args) {
          SpringApplication.run(SpringBootWebReqRespApplication.class, args);
      }
  }
  //更改扫描的位置
  ```

  @ComponentScan注解虽然没有显示配置,但是实际上已经包含在启动类声明注解@SpringBootApplication中,默认扫描的范围是启动类所在包及其子包

  

  

### 7.7.5.DI详解



- @Primary:

  ```java
  @Primary
  @Service
  public class EmpServiceA implements EmpService{
    
  }
  ```

- @Qualifier:

  ```java
  @RestController
  public class EmpController{
    @Qualifer("empServiceA")
    @Autowired
    private EmpService empService;
  }
  ```

- @Resource(name=“bean的名称”)

  ```java  
  @RestController
  public class EmpController{
    @Resource(name = "empServiceB")
    private EmpService empService;
  }
  ```

- @Autowired是spring框架提供的注解,而@Resource是JDK提供的注解

- **@Autowired默认是按照类型注入,而@Resource默认是按照名称注入的**





# 8.MySQL

# 9.MyBatis

## 9.1.MyBatis介绍

- 是一款优秀的持久层框架,**支持自定义SQL,存储过程及高级映射,MyBatis免除了所有的JDBC代码及设置参数和获取结果集的工作**

## 9.2.MyBatis快速入门

- 步骤:

  1. 准备SpringBoot,user表,实体类user

  2. 引入MyBatis的相关依赖,配置MyBatis(数据库的连接信息)

  3. 编写SQL语句(注解XML)

     ```properties
     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     spirng.datasource.url=jdbc:mysql://localhost:3306/mybatis
     spring.datasource.username=root
     spring.datasource.password=Han0852963741
     #配置MyBatis的数据信息
     #配置文件要配置在application.properties
     #属性名=属性值
     #底层自动使用数据库连接池系统来管理和分配这些连接(connection)
     ```
     
     ```java
     @SpringBootTest
     //Springboot整合单元测试的注解
     class SpringBootMybatis1ApplicationTests {
     
     	@Autowired
     	private UserMapper userMapper;
     	//根据依赖注入IOC容器去寻找这个
     
     	@Test
     	void contextLoads() {
     		List<User> userList = userMapper.list();
     
     		userList.stream().forEach(user -> {
     			System.out.println(user);
           //输出User信息
     		});
     	}
     	//自动加载SpringBoot的环境
     }
     ```
     
     ```java
     @Mapper //表示这是一个MyBatis的接口
     //在运行时 会自动生成该接口的实现类对象(代理对象) 并且将该对象交给IOC容器管理
     public interface UserMapper {
         //查询全部的用户信息
       	//SQL语句
         @Select("select id from user")
         public List<User> list();
       	//MyBatis自动将这个查询出的数据 自动封装到这个List集合中
       
     
     }
     ```
     
     **Mapper注解在运行时 会自动生成该接口的实现类对象(代理对象) 并且将该对象交给IOC容器管理**





## 9.3.JDBC

- JDBC是Java提供一套用于数据库操作接口的API,Java程序员只需要面向这套接口编程即可,不同的数据库厂商,需要针对这套接口,提供不同实现



### 9.3.1.数据库连接池

- 线程池:

  1. **降低资源消耗。**通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
  2. **提高响应速度**。当任务到达时，任务可以不需要等到线程创建就能立即执行。
  3. **提高线程的可管理性**。线程是稀缺资源，如果无限制的创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一的分配，调优和监控。

- 数据库连接池:

  1. 数据库连接池是个容器,负责分配,管理数据库连接
  2. **允许应用程序重复使用一个现有的数据库连接,而不再重新建立一个**
  3. **释放空闲时间超过最大空闲时间的连接**,来避免因为没有释放连接而引起的数据库连接泄露

- 数据库连接池种类

  1. JDBC的数据库连接池使用java.sql.DataSource来表示,**DataSource只是一个接口,该接口通常由第三方提供实现**
  2. C3P0数据库连接池,速度相对较慢,稳定性不错(hibernate,spring)
  3. DBCP数据库连接池,速度相对c3p0较快,但不稳定
4. Proxool数据库连接池,有监控连接池状态的功能,稳定性较c3p0差一点
  5. BoneCP数据库连接池,速度快
6. **Druid(德鲁伊)是阿里提供的数据库连接池,集DBCP,C3P0,Proxool优点于一身的数据库连接池**
  7. **Hikari(SpringBoot默认连接池)(追光者)**

- 切换连接池:

  ```xml
  <dependency>
  	<groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.2.8</version>
  </dependency>
  <!--Druid的依赖 -->
  ```

  ```properties
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.url=jdbc:mysql://localhost:3306/mybatis
  spring.datasource.username=root
  spring.datasource.password=Han0852963741
  ```

  ```properties
  spring.datasource.druid.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.druid.url=jdbc:mysql://localhost:3306/mybatis
  spring.datasource.druid.username=root
  spring.datasource.druid.password=Han0852963741
  #俩种配置Druid的方法
  ```



## 9.4.lombok工具

- Lombok**是一个实用的Java类库,能通过注解的形式自动生成构造器**,getter/setter,equals,hashcode,toString等方法,并可以自动化生成日志变量,简化Java的开发,提高了效率

  | 注解                | 作用                                                         |
  | ------------------- | ------------------------------------------------------------ |
  | @Getter/@Setter     | 为所有属性提供Get/Set方法                                    |
  | @ToString           | 会给类自动生成易阅读的toString方法                           |
  | @EqualsAndHashCode  | 根据类所拥有的非静态字段自动重写equals方法和hashCode方法     |
  | @Data               | 提供了更综合的生成代码功能(@Getter+@Setter+@ToString+@EqualsAndHashCode) |
  | @NoArgsConstructor  | 为实体类生成无参的构造器方法                                 |
  | @AllArgsConstructor | 为实体类生成了除了static修饰的字段之外带有各参数的构造器方法 |

  ```xml
  <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
  </dependency>
  <!-- lombok的依赖 -->
  ```

  ```java
  //@Data
  /**
   * @see Getter
   * @see Setter
   * @see RequiredArgsConstructor
   * @see ToString
   * @see EqualsAndHashCode
   * @see lombok.Value
   */
  ```




## 9.5.MyBatis基础操作

### 9.5.1.Delete操作

- 根据主键删除

  ```java
  @Delete("delete from emp where id = #{id}")
      public void delete(Integer id);
  //==> Preparing: delete from emp where id = ?
  //==> Parameters: 16(Integer)
  //预编译接口 #{...} = ? 
  ```

  - 如果Mapper接口方法形参只有一个普通类型的参数,#{…}里面的属性名可以随便写,如#{id},#{value}

- 预编译SQL

  - 安全性更高
  - 性能更高(防止SQL注入)

- 参数占位符

  - #{}:
    1. 执行SQL语句时,会将#{…}替换为?,生成预编译的SQL,会自动设置参数值
    2. 使用时机:参数传递,都使用#{…}
  - ${}:
    1. 拼接SQL.直接将参数拼接在SQL语句中,存在SQL注入问题
    2. 使用时机:如果对表名.列表进行动态设置时使用



### 9.5.2.Insert操作

```java
//增加员工
@Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
        "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
public void insert(Emp emp);
//有多个参数 使用实体类包起来 
```

```java
@Test
public void testInsert(){
    Emp emp = new Emp();
    emp.setUsername("dick");
    emp.setName("dick");
    emp.setImage("1.png");
    emp.setGender((short) 1);
    emp.setJob((short) 1);
    emp.setEntrydate(LocalDate.of(2000, 1, 1));
    emp.setCreateTime(LocalDateTime.now());
    emp.setUpdateTime(LocalDateTime.now());
    emp.setDeptId(1);
    empMapper.insert(emp);

}
```

```java
==>  Preparing: insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (?,?,?,?,?,?,?,?,?)
==> Parameters: dick(String), dick(String), 1(Short), 1.png(String), 1(Short), 2000-01-01(LocalDate), 1(Integer), 2024-03-15T15:01:43.323391200(LocalDateTime), 2024-03-15T15:01:43.323391200(LocalDateTime)
//预编译生成的SQL语句
```

- 主键返回

  - 在数据添加成功后,需要获取插入数据库数据的主键.

    ```java
    //增加员工
    @Options(keyProperty = "id",useGeneratedKeys = true)
    //keyProperty代表 获取的主键最终封装到emp的id属性当中
    //useGeneratedKeys代表 我们需要拿到生成的主键值
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);
    ```

    ```java
    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("dick3");
        emp.setName("dick3");
        emp.setImage("3.png");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
        empMapper.insert(emp);
        System.out.println(emp.getId());
        //21
    }
    ```



### 9.5.3.Update操作

```java
@Update("update emp set username = #{username} , name = #{name},gender = #{gender},image=#{image},job=#{job},entrydate= #{entrydate}," +"dept_id= #{deptId},update_time= #{updateTime} " +"where id = #{id}")
public void update(Emp emp);

//==>  Preparing: update emp set username = ? , name = ?,gender = ?,image=?,job=?,entrydate= ?,dept_id= ?,update_time= ? where id = ?
//==> Parameters: dick(String), dick(String), 1(Short), 3.png(String), 1(Short), 2000-01-01(LocalDate), 1(Integer), 2024-03-15T15:25:23.929492(LocalDateTime), 18(Integer)
//<==    Updates: 1
```

```java
@Test
public void testUpdate(){
    Emp emp = new Emp();
    emp.setId(18);
    emp.setUsername("dick");
    emp.setName("dick");
    emp.setImage("3.png");
    emp.setGender((short) 1);
    emp.setJob((short) 1);
    emp.setEntrydate(LocalDate.of(2000, 1, 1));
    emp.setUpdateTime(LocalDateTime.now());
    emp.setDeptId(1);
    empMapper.update(emp);
}
```



### 9.5.4.Select操作

```java
//根据ID查询对象
@Select("select * from emp where id = #{id}")
public Emp getById(Integer id);
```

```java
@Test
public void testGetById(){
    Emp emp = empMapper.getById(20);
    System.out.println(emp);
}
//==>  Preparing: select * from emp where id = ?
//==> Parameters: 21(Integer)
//<==    Columns: id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time
//<==        Row: 21, dick2, 123456, dick2, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:11:00, 2024-03-15 15:11:00
//<==      Total: 1
//Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@372461a9]
//Emp(id=21, username=dick2, password=123456, name=dick2, gender=1, image=3.png, job=1, entrydate=2000-01-01, deptId=null, createTime=null, updateTime=null)
```

```java
//deptId=null,createTime=null, updateTime=null全为null 但数据库中有数据
```

- 数据封装:
  1. 实体类属性名 和数据库表查询返回的字段名一致,mybatis会自动封装
  2. 如果实体类属性名 和数据库表查询返回的字段名不一致,不能自读封装

- 解决方法:

  1. 起别名:在SQL语句中,对不一样的列名起别名,别名和实体属性名一样

     ```java
     //方法一: 给字段起名,让别名与实体类属性一致
     @Select("select id, username, password, name, gender, image, job, entrydate," +
               " dept_id deptId, create_time createTime, update_time updateTime" +
               " from emp where id = #{id}")
       public Emp getById(Integer id);
     ```

  2. 手动结果映射:通过@Results及@Result进行手动结果映射

     ```java
     //方法二:通过@Results,@Result注解手动映射封装
     
     @Results({ //进行手动封装
             @Result(column = "dept_id", property = "deptId"),
             @Result(column = "create_time", property = "createTime"),
             @Result(column = "update_time", property = "updateTime")
     })
     @Select("select * from emp where id = #{id}")
     public Emp getById(Integer id);
     ```

  3. 开启驼峰命名:如果字段名与属性名符号驼峰命名规则,mybatis会自动通过驼峰命名规则映射

     ```properties
     # 开启Mybais的驼峰命名自动映射方法
     mybatis.configuration.map-underscore-to-camel-case=true
     ```

     ```java
     @Select("select * from emp where id = #{id}")
         public Emp getById(Integer id);
     //直接查询
     ```



### 9.5.5.条件查询

```java
//条件查询
@Select("select * from emp where name like '%${name}%'and gender = #{gender} and "+
			"entrydate between #{begin} and #{end}"
 			 +" order by update_time desc")
// ${}不会进行预编译
// #{}会进行预编译 #{}不能出现在""中 所以使用${}来代替#{}
public List<Emp> list (String name, Short gender, LocalDate begin, LocalDate end);
//此方法性能低 存在SQL注入问题

//通过字符串拼接技术
@Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and "+
      "entrydate between #{begin} and #{end}"
      +" order by update_time desc")
public List<Emp> list (String name, Short gender, LocalDate begin, LocalDate end);
//推荐方法 不存在SQL注入问题
```

```java
@Test
public void testList() {
    List<Emp> empList = empMapper.list("d", (short) 1,
            LocalDate.of(20, 1, 1), LocalDate.of(2025, 1, 1));
    System.out.println(empList);
}
//<==    Columns: id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time
//<==        Row: 18, dick, 123456, dick, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:01:43, 2024-03-15 15:31:36
//<==        Row: 22, dick3, 123456, dick3, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:12:03, 2024-03-15 15:12:03
//<==        Row: 21, dick2, 123456, dick2, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:11:00, 2024-03-15 15:11:00
//<==      Total: 3
```

- 在SpringBoot的1.X版本/或者单独使用mybatis

  ```java
  @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and "+
        "entrydate between #{begin} and #{end}"
        +" order by update_time desc")
  public List<Emp> list(@Param("name") String name,@Param("gender") Short gender,
                       @Param("begin") LocalDate begin, @Param("end") LocalDate end);
  //生成的字节码文件中
  @Select({"select * from emp where name like concat('%',#{name},'%') and gender = #{gender}"})
  List <Emp> list (Sting var1,Short var2, LocalDate var3,LocatDate var4);
  //它们的名字都是var1,var2,var3  此时就无法使用#{} 这时就需要@Param注解去给这些去起名字 
  ```

- SpringBoot的2.X版本内置了插件





## 9.6.XML映射文件

- XML规范:

  1. XML映射文件的名称与Mapper接口名称一致,并且将XML映射文件和Mapper接口放置在相同包下(同包同名)

  2. XML映射文件的**namespace属性为Mapper接口全限定名一致**

  3. XML映射文件中的SQL语句的id与Mapper接口中的方法名一致,并且保持返回类型一致.

     <a href="https://smms.app/image/PRztXUYZx32ynDm" target="_blank"><img src="https://s2.loli.net/2024/03/15/PRztXUYZx32ynDm.png" ></a>

     ```java
     //Mapper接口
     @Mapper
     public interface EmpMapper{
       public List<Emp> list (String name,Short gender,LocalDate begin,LocalDate end);
     }
     ```

     ```xml
     <?xml version="1.0" encoding="UTF-8" ?>
     <!DOCTYPE mapper
             PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
             "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
     <mapper namespace="com.it117.spring_boot_mybatis_lombok_emp.mapper.EmpMapper">
     
     </mapper>
     <!-- xml的基本文件配置完成-->
     ```

     ```java
     public List<Emp> list (String name, Short gender, LocalDate begin, LocalDate end);
     //不需要注解 直接使用这个方法
     ```

- MybatisX是一款基于IDEA的快速开发Mybatis的插件,为效率而生

- **简单的增删改查使用注解,复杂的SQL语句使用XML配置映射语句**





## 9.7.Mybatis动态SQL

随着用户输入或者外部条件的变化而变化的SQL语句,我们称为动态SQL

### 9.7.1.\<if> \<where> \<set>

- \<if> and \<where>:用于判断条件是否成立,使用Test属性进行条件判断,如果条件为True,则拼接SQL

  ```xml
  <select id="list" resultType="com.it117.spring_boot_mybatis_lombok_emp.pojo.Emp">
      <!-- # id需要与Mapper接口中的方法名一致 并保持返回类型一致.-->
      <!-- 如果有返回值 resultType="" -->
      <!-- resultType :单条记录所封装的类型-->
  
      select *
      from emp
      <where> <!--where会自动进行判断是否要加where和and -->
        <!-- 如果where里面的条件都不成立 就不会显示where-->
      <if test="name != null ">
          name like concat('%', #{name}, '%')
      </if>
      <if test="gender != null">
          and gender = #{gender}
      </if>
      <if test="begin != null and end != null">
          and entrydate between #{begin} and #{end}
      </if>
      order by update_time desc
      </where>
  </select>
  ```

  - **where元素只会在子元素有内容的情况下才插入where子句,而且会自动去除子句的开头AND或OR**

  ```xml
  <!--    动态更新员工的信息-->
  <update id="update">
      update emp
      <set>
          <if test="username != null">
              username = #{username},
          </if>
  
          <if test="name! = null">
              name = #{name},
          </if>
  
          <if test="gender! = null">
              gender = #{gender},
          </if>
  
          <if test="image! = null">
              image = #{image},
          </if>
  
          <if test="job != null">
              job = #{job},
          </if>
  
          <if test="entrydate != null">
              entrydate = #{entrydate},
          </if>
  
          <if test="deptId != null">
              dept_id = #{deptId},
          </if>
  
          <if test="updateTime != null">
              update_time = #{updateTime}
          </if>
      </set>
      where id = #{id}
  </update>
  ```

  - **\<set>标签动态的在行首插入SET关键字,并会删掉额外的逗号(使用在Update语句中)**

### 9.7.2.\<foreach>

 ```java
 public void deleteByIds(List<Integer> ids);
 ```

```java
@Test
public void testDeleteByIds(){
    List<Integer> ids = Arrays.asList(12,13,15);
    //基于Array这个类的asList方法进行集合
    empMapper.deleteByIds(ids);
}
//==>  Preparing: delete from emp where id in ( ? , ? , ? )
//==> Parameters: 12(Integer), 13(Integer), 15(Integer)
//<==    Updates: 3
```

```xml
<!--    批量删除员工信息-->
<delete id="deleteByIds">
    delete from emp where id in
    <!--
    collection 表示集合
    item 表示遍历出来的元素
    separator 表示使用什么分隔符
    open 表示开始前拼接的片段
    close 表示遍历结束后拼接的片段
    -->
    <foreach collection="ids" item="id" separator="," open="(" close=")">
        #{id}
    </foreach>
</delete>

```





### 9.7.3.\<sql> \<include>

```xml
<!--    sql片段的id为commonSelect-->
<sql id="commonSelect">
    select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time
    from emp
</sql>
<select id="list" resultType="com.it117.spring_boot_mybatis_lombok_emp.pojo.Emp">
    <!-- # id需要与Mapper接口中的方法名一致 并保持返回类型一致.-->
    <!-- 如果有返回值 resultType="" -->
    <!-- resultType :单条记录所封装的类型-->

    <include refid="commonSelect"/>
    <!-- 自闭合-->
    <where> <!--where会自动进行判断是否要加where和and -->
    <if test="name != null ">
        name like concat('%', #{name}, '%')
    </if>
    <if test="gender != null">
        and gender = #{gender}
    </if>
    <if test="begin != null and end != null">
        and entrydate between #{begin} and #{end}
    </if>
    order by update_time desc
    </where>
</select>
```

- \<sql> 负责对公共片段的抽取
- \<include> 负责对公共片段的使用





# 10.开发案例

## 10.1.REST

- REST(REpresentational State Tranfer),**表述性状态转换,它是一种软件架构风格**

  ```http
  //传统风格的URL
  http://localhost:8080/user/getById?id=1 		//GET 查询id为1的用户
  http://localhost:8080/user/saveUser					//POST 新增用户
  http://localhost:8080/user/updateUser   		//POST 修改用户
  http://localhost:8080/user/deleteUser?id=1 	//GET 删除id为1的用户
  ```

  ```http
  //REST风格
  http://localhost:8080/users/1		//GET  查询id为1的用户
  http://localhost:8080/user			//POST 新增用户
  http://localhost:8080/user			//PUT	 修改用户
  http://localhost:8080/user/1		//DELETE 删除id为1的用户
  ```

  - REST是风格,是约定方式,约定不是规定,可以打破
  - 描述模块的功能通常使用复数,也就是加s的格式来描述,表示此类资源,而非单个资源,如:users,emps,books

- 前后端交互的统一结果Result

  ```java
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Result{
    private Interger code;  // 响应码 1代表成功 2代表失败
    private String msg;			// 响应信息 描述字符串
    private Object date;		// 返回的数据
    public static Result success(){ //增删改 成功响应
      return new Result(1,"success",null);
    }
    public static Result success(Object data){//查询 响应成功
      return new Result (1,"success",data);
    }
    public static Reuslt error(String msg){//失败响应
  		return new Result (0,msg,null);
    }
  }
  ```



![image.png](https://s2.loli.net/2024/03/15/wAav3WJ5ElTypbB.png)

## 10.2.注解

- @SLf4j 注解:这个注解直接调用log.info方法可以输出日志 比如sout更加正规 `//private static Logger log = LoggerFactory.getLogger(DeptController.class);`

- GetMapping:

  ```java
  @GetMapping("/depts")
  //@RequestMapping(value = "/depts",method = RequestMethod.GET) = GetMapping("/depts)
  //直接使用@GetMapping 就是设定这个请求方式为GET
  //RequestMethod 为枚举类型
  /**
   * public enum RequestMethod {
   *     GET,
   *     HEAD,
   *     POST,
   *     PUT,
   *     PATCH,
   *     DELETE,
   *     OPTIONS,
   *     TRACE;
   *     }
   */
  //GetMapping相当于mapping限制了get的请求数据的方式
  ```

  ![image.png](https://s2.loli.net/2024/03/15/LjAboqWFpnBcaN6.png)

- 前后端联调

  - 使用nginx来测试数据是否能成功进入到web中
  - 进行测试

- RequestMapping优化

  - 优化前

    ```java
    @Slf4j // 这个注解 直接调用log.info的方法
    @RestController //将返回值转换为json返回
    public class DeptController {
        @Autowired
        private DeptService deptService; // 注入BEAM对象
        @GetMapping("/depts")
        public Result list(){
            List<Dept> deptList = deptService.list();
            log.info("查询全部的部门数据");
            return Result.success(deptList);
        }
        @DeleteMapping("/depts/{id}")
        public Result delete(@PathVariable String id){
            log.info("根据ID来删除部门:{}",id);
            deptService.delete(id);
            return Result.success();
        }
     
        @PostMapping("/depts")
        public Result add(@RequestBody Dept dept){
            log.info("新增加一个部门:{}",dept);
            deptService.add(dept);
            return Result.success( );
        }
    }
    ```

  - 优化后

    ```java
    @Slf4j 
    @RestController
    @RequestMapping("/depts")
    public class DeptController {
      
        @Autowired
        private DeptService deptService;
      
        @GetMapping
        public Result list(){
            List<Dept> deptList = deptService.list();
            log.info("查询全部的部门数据");
            return Result.success(deptList);
        }
        @DeleteMapping("{id}")
        public Result delete(@PathVariable String id){
            log.info("根据ID来删除部门:{}",id);
            deptService.delete(id);
            return Result.success();
        }
     
        @PostMapping
        public Result add(@RequestBody Dept dept){
            log.info("新增加一个部门:{}",dept);
            deptService.add(dept);
            return Result.success( );
        }
    }
    //优化后
    ```

  - 一个完整的请求路径,应该是类上的@RequestMapping的value属性+方法上的@RequestMapping的value属性

- 回显

  ```java
  @GetMapping("/{id}")
  public Result GetById(@PathVariable Integer id){
    log.info("查询部门的{}", id);
    return Result.success(deptService.GetById(id));
  }
  
  /**
   * 进行回显
   * 查询部门
   * @param id 查询部门的ID
   */
  public Dept GetById(Integer id);
  
  @Override
  public Dept GetById(Integer id) {
      return deptMapper.GetById(id);
  }
  
  /**
   * 进行回显
   * @param id 回显部门的ID
   */
  @Select("select * from  dept where  id = #{id}")
  Dept GetById(Integer id);
  ```

## 10.3.分页

- 分页显示SQL语句

  ```mysql
  -- 查询第一页数据,每页展示5条记录
  select * from emp limit 0,5;
  -- 查询第二页数据,每页展示5条记录
  select * from emp limit 5,5;
  -- 查询第三页数据,每页展示5条记录
  select * from emp limit 10,5;
  -- 查询第n页数据,每页展示m条记录
  select * from emp limit (n-1)*m ,m;
  -- (页码 - 1) * 每页展示记录
  ```

  ```java
  //EmpController
  @Autowired
  private EmpService empService;
  @GetMapping("/emps")
  //@RequestParam(defaultValue = "1") 设置默认值
  public Result page(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10")Integer pageSize){
  log.info("分页查询,参数:{},{}", page,pageSize);
  //使用service方法进行擦洗
   PageBean pageBean = empService.page(page,pageSize);
  return Result.success(pageBean);
  }
  //EmpService
  public PageBean page(Integer page, Integer pageSize);
  
  //EmpServiceimpl
  @Autowired
  private EmpMapper empMapper ;
  @Override
  public PageBean page(Integer page, Integer pageSize) {
      //获取记录数
      Long count = empMapper.count();
      //获取分页查询的结果列表
      List<Emp> pageList = empMapper.page((page - 1) * pageSize, pageSize);
      //封装PageBeam
      PageBean pageBean = new PageBean(count,pageList);
  
  
      return pageBean;
  }
  
  //EmpMapper
  /**
   * 查询总记录数
   * @return 记录数
   */
  @Select("select  count(*) from emp")
  public Long count();
  
  /**
   * 分页查询获取列表式
   * @param start 开始页码
   * @param pageSize 查询的记录数
   */
  @Select("select * from emp limit #{start}, #{pageSize}")
  public List<Emp> page(Integer start, Integer pageSize);
  ```

  **@RequestParam(defaultValue = "1") 设置默认值**



## 10.4.分页插件

- 分页插件PageHelper

  代码固定并繁琐,使用PageHelper插件,快速进行分页功能

  ```xml
  <!--pageHelper插件 进行自动分页-->
  <dependency>
      <groupId>com.github.pagehelper</groupId>
      <artifactId>pagehelper-spring-boot-starter</artifactId>
      <version>1.4.2</version>
  </dependency>
  <!-- 引入PageHelper的依赖-->
  ```

  ```java
  @Override
  public PageBean page(Integer page, Integer pageSize) {
      //设置分页查询的参数
      //page – 页码
      //pageSize – 每页显示数量
      PageHelper.startPage(page, pageSize);
    
      //进行查询
      List<Emp> empList = empMapper.list();
      Page<Emp> pageList =(Page) empList;//分页查询的结果
    
      //封装page类
      //pageList.getTotal()是获取总记录数
      //pageList.getResult()是获取结果列表
      PageBean pageBean = new PageBean(pageList.getTotal(),pageList.getResult());
      return pageBean;
    
  }
  
  /**
   * 员工信息查询插件的使用pageHelper
   * @return 返回为Emp的List
   */
  @Select("select * from emp")
   public List<Emp> list();
  //我们只需要进行查询这个数据库的数据
  //然后返回给分页插件 这个分页插件会帮我们进行分页和查询
  ```

- 条件分页查询

  ```java
  //EmpController
  @Autowired
  private EmpService empService;
  @GetMapping("/emps")
  //@RequestParam(defaultValue = "1") 设置默认值
  public Result page(@RequestParam(defaultValue = "1") Integer page,
                     @RequestParam(defaultValue = "10")Integer pageSize,
                     String name, Short gender,
                     @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                     @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
                      //日期需要指定时间格式
      log.info("分页查询,参数:{},{},{},{},{},{}", page, pageSize,name,gender, begin, end);
      //使用service方法进行测试
      PageBean pageBean = empService.page(page, pageSize, name,  gender,  begin,  end);
      return Result.success(pageBean);
  }
  
  //EmpServiceimpl
  @Override
  public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
      PageHelper.startPage(page, pageSize);
      List<Emp> empList = empMapper.list( name,  gender,  begin, end);
      Page<Emp> pageList =(Page) empList;//分页查询的结果
      PageBean pageBean = new PageBean(pageList.getTotal(),pageList.getResult());
      return pageBean;
  }
  
  //EmpMapper
   public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
  ```

  ```xml
  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE mapper
          PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
          "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  <mapper namespace="com.it117.spring_boot_tlias.mapper.EmpMapper">
  
      <!--resultType是单个实体类的类型 -->
      <select id="list" resultType="com.it117.spring_boot_tlias.pojo.Emp">
          select *
          from emp
          <where>
              <if test="name != null and name != ''">name like concat('%',#{name},'%')</if>
              <if test="gender != null">and gender = #{gender}</if>
              <if test="begin != null and end != null">and entrydate between #{begin} and #{end}</if>
          </where>
          order by update_time desc
      </select>
  </mapper>
  ```

## 10.5.批量删除数据

- 动态批量删除数据

  ```java
  //EmpController
  @DeleteMapping("/{ids}")
  //pathVariable路径参数
  public Result delete(@PathVariable List<Integer> ids){
  
      log.info("执行批量删除操作,ids:{}", ids);
      empService.delete(ids);
      return Result.success();
  }
  
  //EmpService
  public void delete(List<Integer> ids);
  
  //EmpServiceimpl
  @Override
  public void delete(List<Integer> ids) {
      empMapper.delete(ids);
  }
  
  //EmpMapper
  <delete id="delete">
      delete from emp
      where id in
      <foreach collection="ids" item="id" separator="," open="(" close=")">
          #{id}
      </foreach>
  </delete>
  ```

## 10.6.文件上传

- 文件上传

  - 前端页面

    ```html
    <form action="/upload" method="post" enctype="multipatrt/form-data">
      name:<input type = "text" name="username"><br>
      age:<input type="text" name ="age"><br>
      head_image:<input type="file" name="image"><br>
      <input type="submit" value="提交">
    </form>
    ```

    ```xml-dtd
    -----------------------------174370883232716593823327952520
    Content-Disposition: form-data; name="username"
    
    123
    -----------------------------174370883232716593823327952520
    Content-Disposition: form-data; name="age"
    
    123
    -----------------------------174370883232716593823327952520
    Content-Disposition: form-data; name="image"; filename="Git.md"
    Content-Type: application/octet-stream
    
    -----------------------------174370883232716593823327952520 为分隔符
    ```

  - 后端页面

    ```java
    @Slf4j
    @RestController
    public class UploadController {
    
    //MultipartFile image 的形参名必须与前端页面中文件提交的name相等
    //如果前端和后端的文件名字不同
    //可以使用注解RequestParam
    //@RequestParam("image")MultipartFile file
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image){
    
        log.info("文件上传:{},{},{}", username,age,image);
        return Result.success();
    	}
    }
    ```

    ```JAVA
    //文件上传的文件名不会重复
    //使用UUID
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
      log.info("文件上传:{},{},{}", username,age,image);
      //UUID 通用唯一识别码
      //将文件储存在E:\\WebFile
      String originalFilename = image.getOriginalFilename();
      int index = originalFilename.lastIndexOf(".");
      String substring = originalFilename.substring(index);
      String newFileName = UUID.randomUUID().toString()+substring;
      log.info("新的文件名:{}",newFileName);
      image.transferTo(new File("E:\\WebFile\\"+newFileName));
      return Result.success();
    }
    ```

    ```properties
    #配置单个文件的最大上传大小
    spring.servlet.multipart.max-file-size=10MB
    #配置单个请求最大上传大小(一次请求可以上传多个文件)
    spring.servlet.multipart.max-request-size=100MB
    #application.properties
    ```

    **在SpringBoot中,文件上传,默认单个文件允许最大大小为1M,如果需要上传大文件,可以进行该配置**

  - multipartFile方法

    1. `String get0riginalFilename();//获取原始文件名`
    2. `void trandsferTo(File dest);//将接受的文件转存到磁盘文件中`
    3. `long getSize();//获取文件的大小,单位:字节`
    4. `InputStream getInputStream();//获取接受到的文件内容的输入流`

    **由于本地存储有诸多的不便,所以我们现在不使用,直接使用云服务器来储存数据**

## 10.7.云服务

- 云服务器的使用

  - SDK(Software Development Kit)软件开发工具包,包括辅助软件开发的依赖(jar包),代码实例等等,都是SDK

  - Bucket:存储空间是用户用于存储对象(Object 就是文件) 的容器,所有对象都必须隶属于某个存储空间

  - 密钥:

    ```xml
    SecretId:AKIDXzV0LafjjaXL1jYK4lTAzmWQSp7HVfjv
    SecretKey:BAyjPxbCmWCh7OoBPSKG2eFd2a4qY8Wx
    ```

- 使用工具类进行上传文件

  ```java
  /**
  * 阿里云 OSS 工具类
  */
  @Component //交给IOC容器
  public class AliOSSUtils {
  
    private String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
    private String accessKeyId = "LTAI5tLxAj66nRkiZLfK74bb";
    private String accessKeySecret = "SrSiwPSQZh1xVg3aO3iUzeLpG3QvjJ";
    private String bucketName = "springbootwebstudy";
  
    /**
     * 实现上传图片到OSS
     */
    public  String upload(MultipartFile file) throws IOException {
        // 获取上传的文件的输入流
        InputStream inputStream = file.getInputStream();
  
        // 避免文件覆盖
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
  
        //上传文件到 OSS
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, fileName, inputStream);
  
        //文件访问路径
        String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;
        // 关闭ossClient
        ossClient.shutdown();
        return url;// 把上传到oss的路径返回
    }
  
  }
  //OSS_TOOLS
  ```

  ```JAVA
  @Autowired
  //通过IOC容器调出AliOSUtils工具类
  private AliOSSUtils aliOSSUtils;
  
  /**
   * 使用工具类进行上传文件
   * @param image
   * @return
   * @throws IOException
   */
  
  @PostMapping("/upload")
  public Result Upload(MultipartFile image) throws IOException {
      log.info("文件上传:{}", image.getOriginalFilename());
  
      //调用OSS工具类进行文件上传
      String url = aliOSSUtils.upload(image);
      log.info("文件上传的URL为:{}", url);
  
      return Result.success(url);
  }
  ```



## 10.8.配置文件

- 配置文件

  ```properties
  aliyun.oss.endpoint=https://oss-cn-hangzhou.aliyuncs.com
  aliyun.oss.accessKeyId=LTAI5tLxAj66nRkiZLfK74bb
  aliyun.oss.accessKeySecret=SrSiwPSQZh1xVg3aO3iUzeLpG3QvjJ
  aliyun.oss.bucketName=springbootwebstudy
  #列编辑 ALT + 鼠标左键
  ```

  ```java
  @Value("${aliyun.oss.endpoint}")
  private String endpoint ;
  @Value("${aliyun.oss.accessKeyId}")
  private String accessKeyId ;
  @Value("${aliyun.oss.accessKeySecret}")
  private String accessKeySecret ;
  @Value("${aliyun.oss.bucketName}")
  private String bucketName ;
  ```

  **@value 注解通常用于外部配置的属性注入,具体用法为:@Value(“${配置文件中的key}”,只能一个属性一个属性的注入**

- yml配置文件

  ```yml
  server:
    port: 9000
    adderss: 127.0.0.1
  ```

  1. 大小写敏感
  2. 数组前边必须有空格
  3. 使用缩进表示层级关系,缩进时,不允许使用Tab键,只能用空格(IDEA中会自动将Tab转换位空格)
  4. 缩进的空格数目不重要,只要相同层级的元素左侧对齐即可
  5. #表示注解,从这个字符一直到行尾,都会被解析器忽略

- XML配置文件

  ```xml
  <server>
  	<port>8080</port>
    <adderss>127.0.0.1</adderss>
  </server>
  ```

- yml数据格式

  ```yml
  #定义对象或者Map对象
  user:
    name: tom
    age : 20
    adderss: beijing
  
  #定义数组或list集合
  hobby:
    - java
    - c
    - game
    - sports
  ```

  ```yml
  #springboot的配置文件
  spring:
    datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://localhost:3306/tlias
      username: root
      password: Han0852963741
      #文件上传的配置
    servlet:
      multipart:
        max-file-size: 10MB
        max-request-size: 100MB
  
  #mybatis配置文件
  mybatis:
    configuration:
      log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
      map-underscore-to-camel-case: true
  
  #上传文件的配置
  aliyun:
    oss:
      endpoint: https://oss-cn-hangzhou.aliyuncs.com
      accessKeyId: LTAI5tLxAj66nRkiZLfK74bb
      accessKeySecret: SrSiwPSQZh1xVg3aO3iUzeLpG3QvjJ
      bucketName: springbootwebstudy
  ```

- @ConfigurationProperties

  **可以批量的将外部的属性配置注入到bean对象的属性中**

  ```java
  @Data
  @Component
  @ConfigurationProperties(prefix = "aliyun.oss")
  //指定前缀
  public class AliLOSSProperties {
      private String endpoint ;
      private String accessKeyId ;
      private String accessKeySecret ;
      private String bucketName ;
  }
  ```

  ```java
  @Component //交给IOC容器
  public class AliOSSUtils {
    
  @Autowired
  private  AliLOSSProperties aliLOSSProperties;
  
  public  String upload(MultipartFile file) throws IOException {
      //获取aliyunOSS的对象
  		//调用对象
      String accessKeyId = aliLOSSProperties.getAccessKeyId();
      String endpoint = aliLOSSProperties.getEndpoint();
      String accessKeySecret = aliLOSSProperties.getAccessKeySecret();
      String bucketName = aliLOSSProperties.getBucketName();
  
      // 获取上传的文件的输入流
      InputStream inputStream = file.getInputStream();
  
      // 避免文件覆盖
      String originalFilename = file.getOriginalFilename();
      String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
  
      //上传文件到 OSS
      OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
      ossClient.putObject(bucketName, fileName, inputStream);
  
      //文件访问路径
      String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;
      // 关闭ossClient
      ossClient.shutdown();
      return url;// 把上传到oss的路径返回
  }
  }
  
  ```

  ```xml
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-configuration-processor</artifactId>
  </dependency>
  <!-- 依赖文件 可以写也可以不写-->
  ```



## 10.9.登录验证

- 登录

  ```java
  @Autowired
  private EmpService empService;
  @PostMapping("/login")
  public Result login(@RequestBody Emp emp){
      log.info("员工登录:{}", emp);
      Emp e = empService.login(emp);
  
      return e!=null?Result.success():Result.error("用户名或密码错误");
  }
  //loginController
  ```

  ```java
  /**
  * 根据用户名和密码去查询用户
  * @param emp
  * @return
  */
  @Select("select * from emp where username = #{username} and password = #{password}")
  Emp getByUsernameAndPassword(Emp emp);
  //EmpMapper
  ```

  ```java
  @Override
  public Emp login(Emp emp) {
      return empMapper.getByUsernameAndPassword(emp);
  }
  //EmpServiceimpl
  ```

- 会话技术

  - 会话:用户打开浏览器,访问web服务器,会话建立,**直到有一方断开连接,在一次会话中可以包含多次请求和响应**
  - 会话跟踪:一种维护浏览器状态的方法,**服务器需要识别多次请求是否来自同一浏览器,以便在同一次会话的多次请求间共享数据**
  - 会话跟踪方案:
    1. 客户端会话跟踪技术:Cookie
    2. 服务器会话跟踪技术:Session
    3. 令牌技术

- Cookie

  - 优点:HTTP协议中支持的技术
  - 缺点:
    1. 移动端APP无法使用Cookie
    2. 不安全,用户自己可以禁用Cookie
    3. Cookie不能跨域
    4. 跨域区分为:协议,IP/域名,端口 只要这三个不同 就是跨域操作

- Session

  - 优点:存储在服务端,安全
  - 缺点:
    1. 服务器集群环境下无法直接使用Session
    2. Cookie的缺点

- *令牌技术

  - 优点:
    1. 支持PC端,移动端
    2. 解决集群环境下的认证问题
    3. 减轻服务器端存储压力
  - 缺点:
    1. 需要自己实现

- JWT令牌

  - JOSN Web Token 

  - 定义了一种简洁的,自包含的格式,用于在通信双方以JSON数据格式安全的传输信息,由于数字签名的存在,这些信息是可靠的

  - 组成:

    1. Header(头):记录令牌类型,签名算法等,例如:{“alg”:”HS256”,”type”:”jwt”}
    2. Payload(有效载荷):携带一些自定义信息,默认信息等,例如:{“id”:”1”,”username”:”tom”}
    3. Signature(签名):防止Token被篡改,确保安全性,将Header,playload,并加入指定秘钥,通过指定签名算法计算而来

    sadJFGDKSsadkLKMKLlnLNbnjKLNLnl.HJJPIHGKSknKNDlhfjKJjKJKGNkkjN9TOkvLSFKFDGmkdsf=.jfdsKSDFknkhBLKVyoNO.

  - Base64:是一种基于64个可打印字符(A-Z,a-z,0-9, + /)来表示二进制数据的编码方式
  
    ![image.png](https://s2.loli.net/2024/03/18/uD3dh8bHY4N5zmr.png)
  
- JWT令牌的生成

  ```xml
  <dependency>
              <groupId>io.jsonwebtoken</groupId>
              <artifactId>jjwt</artifactId>
              <version>0.9.1</version>
          </dependency>
  ```

  ```java
  HashMap<String, Object> claims = new HashMap<>();
  	claims.put("id", 1);
  	claims.put("username", "tom");
  	String jwt = Jwts.builder()
        .signWith(SignatureAlgorithm.HS256, "i2322") //签名算法
        .setClaims(claims) //自定义内容  载荷部分
        .setExpiration(new Date(System.currentTimeMillis() + 12 * 3600 * 1000)) 
    		// 令牌有效期 超出这个日期就无效了 12 小时的有效期
        .compact(); // 调用compact 得到一个字符串类型的返回值 这个就是我们需要的JWT令牌
  		System.out.println(jwt);
  //eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzEwNzg1Mjc0LCJ1c2VybmFtZSI6InRvbSJ9.hi4VyEdC_5TKyPbkihhTLvzMJFnHLwWUsajgFVY6zdk
  //第一部分和第二部分能够被解析 但是第三部分是被数字签名加密的 无法解析
  
  //解析JWT令牌
  //根据JWTS这个方法来进行解析
  Claims i2322 = Jwts.parser().setSigningKey("i2322") //指定签名秘钥
        .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZX" +
                "hwIjoxNzEwNzg1Mjc0LCJ1c2VybmFtZSI6InRvbSJ9.hi4VyEdC_5TKyPbkihhTLvzMJFnHLwWUsajgFVY6zdk")
        .getBody();//得到自定义内容
  System.out.println(i2322);
  ```

  1. JWT校验时使用的签名秘钥,必须和生成的JWT令牌时使用的秘钥是配套的
  2. 如果JWT令牌解析校验时报错,则说明JWT令牌被篡改或失效了,令牌非法 



## 10.10.过滤器Filter

- 过滤器(Filter)

  - 概念:Filter过滤器,是Javaweb三大 组件(Servlet,Filter,Listener)之一
  - 过滤器可以把对资源的请求拦截下来,从而实现一些特殊的功能.
  - 过滤器一般完成一些通用的操作,比如:登录校验,统一编码处理,敏感字符处理等

  ```java
  @WebFilter(urlPatterns = "/*")  // /*代表拦截所有请求
  public class DemoFilter implements Filter {
      // 默认实现destroy和init 一般只重写doFilter
      /**
       * default void init(FilterConfig filterConfig) throws ServletException {}
       * default默认实现这个方法
       */
    
      @Override
      //初始化方法 只会调用一次方法
      public void init(FilterConfig filterConfig) throws ServletException {
          System.out.println("init 初始化方法执行");
      }
  
      @Override
      //拦截到请求之后调用 会调用多次
      public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
          System.out.println(" 拦截到了请求");
          //只进行拦截了 需要我们进行放行
        	//调用FilterChain中的doFilter的方法 去进行放行
          filterChain.doFilter(servletRequest, servletResponse); // 执行放行操作
      }
    
      @Override
    	//销毁方法 也只会调用一次方法
      public void destroy() {
          System.out.println("destroy 初始化方法执行");
      }
  }
  ```

  ```java
  // WebFilter是javaweb的功能 而不是springboot的功能 所以需要在启动类加上注解@ServletComponentScan
  @ServletComponentScan  // 表示支持Servlet组件支持
  @SpringBootApplication
  public class SpringBootTliasApplication {
      public static void main(String[] args) {
          SpringApplication.run(SpringBootTliasApplication.class, args);
      }
  }
  ```

- Filter详解

  - Filter执行流程:

    1. 先执行doFilter 这个方法中执行放行操作后
    2. 访问web资源
    3. 访问完web资源后 并不会从这个doFilter的重新开始 而是执行放行后的逻辑

  - 根据需求不同,Filter可以拦截不同的资源路径:

    | 拦截路径     | urlPatterms值 | 含义                            |
    | ------------ | ------------- | ------------------------------- |
    | 拦截具体路径 | /login        | 只有访问/login路径时,才会被拦截 |
    | 目录拦截     | /emps/*       | 访问所有资源,都会被拦截         |
    | 拦截所有     | /*            | 访问所有资源,都会被拦截         |

  - 过滤器链:

    - 一个web应用中,可以**配置多个过滤器,这多个过滤器就形成了一个过滤器链**

      ![image.png](https://s2.loli.net/2024/03/18/GPMKX8RBltYm24c.png)

    ```java
    @WebFilter("/*")
    public class AbcFilter implements Filter {
        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ABC拦截到了请求");
        filterChain.doFilter(servletRequest, servletResponse);
        //如果这个第一个过滤器 那么这个放行就会放行到下一个过滤器
        //直到这个过滤器是最后一个过滤器 才会放行到web资源上
        //注解配置的Filter,优先级是按照过滤器类名(字符串)的自然排序
        System.out.println("ABC拦截后的逻辑");
        //ABC拦截到了请求
        //Demo拦截前的逻辑
        //Demo拦截后的逻辑
        //ABC拦截后的逻辑
        }
    }
    
    ```

    **注解配置的Filter,优先级是按照过滤器类名(字符串)的自然排序**

- 登录校验Filter-流程

  1. 获取请求URL
  2. 判断请求URL中是否包含login,如果包含,说明是登录操作,放行
  3. 获取请求头中的令牌(token)
  4. 判断令牌是否存在,如果不存在,返回错误结果(未登录)
  5. 解析Token,如果解析失败,返回错误结果(未登录)
  6. 放行 

  ```xml
  <!--        fastjson-->
  <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>fastjson</artifactId>
      <version>1.2.76</version>
  </dependency>
  <!-- alibaba下的一个转换为JSON格式的一个依赖-->
  ```

  ```java
  @Slf4j
  @WebFilter(urlPatterns = "/*")
  public class LoginCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //1.获取URL
        //servletRequest获取请求参数
        //servletResponse响应结果
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        //得到了请求对象和请求响应
  
        //得到URL
        String url = httpServletRequest.getRequestURL().toString();
        System.out.println(url);
  
        //2.判断url是否包含login
        //如果包含说明是登录请求 直接放行
        if(url.contains("login")){
            log.info("登录操作,放行...");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
      
        //3.获取请求头中 的令牌(token)
        //请求头为token
        String jwt = httpServletRequest.getHeader("token");
  
        //4.判断令牌是否存在
        if(!StringUtils.hasLength(jwt)){
            //hasLength代表这个字符串是否有长度
            //如果为null或者为空 则进入到这个语句中
            log.info("请求头token为空,返回未登录的信息");
            Result error = Result.error("NOT_LOGIN"); //前端只要接受到这个NOT_LOGIN 就强制跳转到登录页面
            //手动转换 为JSON格式
            //使用alibaba的工具包
            String jsonString = JSONObject.toJSONString(error);
  
            //响应给浏览器
            httpServletResponse.getWriter().write(jsonString);
            return; //否则代码会继续执行
        }
  
        //5.校验jwt令牌
        try {
            JwtUtils.parseJWT(jwt);
          	//如果这个JWT令牌非法 会报错
        } catch (Exception e) {
            e.printStackTrace();
            //只要报错 说明令牌是非法的
            log.info("解析令牌失败");
            Result error = Result.error("NOT_LOGIN");
          
            //手动转换 为JSON格式
            //使用alibaba的工具包
            String jsonString = JSONObject.toJSONString(error);
  
            //响应给浏览器
            httpServletResponse.getWriter().write(jsonString);
            return; //否则代码会继续执行
        }
        //6.解析.令牌成功 直接放行
        log.info("令牌合法");
        filterChain.doFilter(servletRequest, servletResponse); //进行放行
  
    }
  }
  
  ```



## 10.11.*拦截器Intereceptor

- 拦截器Intereceptor

  - 概念:是一种动态拦截方法调用的机制,类似于过滤器,**Spring框架中提供的**,用来动态拦截控制器方法的执行
  - 作用:拦截请求,在指定的方法调用前后,根据业务需要执行预先设定的代码

- Intereceptor快速入门

  1. 定义拦截器,实现HandleIntereceptor接口,并重写其所有方法

  2. 注册拦截器

     ```java
     @Component //交给IOC容器
     public class LoginCheckInterceptor implements HandlerInterceptor {
         @Override //从目标资源方法执行 返回true:放行 返回false:不放行
         public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
             System.out.println("preHandle ...");
             return false; //返回值为true 才会进行放行
         }
     
         @Override //目标资源方法执行后执行
         public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
             System.out.println("postHandle....");
         }
     
         @Override //视图渲染完毕后执行,最后执行
         public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
             System.out.println("afterCompletion...");
         }
     }
     ```

     ```java
     @Configuration
     public class WebConfig implements WebMvcConfigurer {
         @Autowired
         private LoginCheckInterceptor loginCheckInterceptor;
     
         @Override
         public void addInterceptors(InterceptorRegistry registry) {
             registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**");
             //注册了一个拦截器
             // /** 表示所有资源
         }
     }
     
     ```

- 详解

  - 拦截器可以根据需求,配置不同的拦截路径:

    ```java
    @Override
    public void addInterceptor(InterceptorRegistry registry){
      registry.addInterceptor(loginCheckInteceptor).addPathPatterns("/**").excludePathPatterns("/login");
      // addPathPatterns 需要拦截哪些资源 excludePathPatterns 不需要拦截哪些资源
    }
    ```

    | 拦截路径  | 含义                 | 举例                                       |
    | --------- | -------------------- | ------------------------------------------ |
    | /*        | 一级路径             | 能匹配/depts,/emps,/login 不能匹配/depts/1 |
    | /**       | 任意及路径           | 能匹配/depts,/depts/1,/depts/1/2           |
    | /depts/*  | /depts下的一级目录   | 能匹配/depts/1,不能匹配/depts/1/2,/depts   |
    | /depts/** | /depts下的任意级路径 | 能匹配/depts,/depts/1/2,不能匹配/emps/1    |

  - 拦截器的执行流程
  
    ![image.png](https://s2.loli.net/2024/03/19/p8CLZvd7zBSEPKw.png)
  
  - Filter和Interceptor
  
    1. 接口规范不同:过滤器需要实现**Filter接口**,而拦截器需要实现**HandlerInterceptor接口**
    2. 拦截范围不同:**过滤器Filter会拦截所有的资源**,而I**nterceptor只会拦截Spring环境中的资源.**
  
- 使用拦截器进行登录校验过程

  ```java
  @Override //从目标资源方法执行 返回true:放行 返回false:不放行
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      System.out.println("preHandle ...");
      //登录校验
      //1.获取URL
  
      //得到URL
      String url = request.getRequestURL().toString();
      System.out.println(url);
  
      //2.判断url是否包含login
      //如果包含说明是登录请求 直接放行
      if(url.contains("login")){
          log.info("登录操作,放行...");
          return true;
      }
      //3.获取请求头中 的令牌(token)
      //请求头为token
      String jwt = request.getHeader("token");
  
      //4.判断令牌是否存在
      if(!StringUtils.hasLength(jwt)){
          //hasLength代表这个字符串是否有长度
          //如果为null或者为空 则进入到这个语句中
          log.info("请求头token为空,返回未登录的信息");
          Result error = Result.error("NOT_LOGIN"); //前端只要接受到这个NOT_LOGIN 就强制跳转到登录页面
          //手动转换 为JSON格式
          //使用alibaba的工具包
          String jsonString = JSONObject.toJSONString(error);
  
          //响应给浏览器
          response.getWriter().write(jsonString);
          return false; //否则代码会继续执行
      }
  
      //5.校验jwt令牌
      try {
          JwtUtils.parseJWT(jwt);
      } catch (Exception e) {
          e.printStackTrace();
          //只要报错 说明令牌是非法的
          log.info("解析令牌失败");
          Result error = Result.error("NOT_LOGIN");
          //手动转换 为JSON格式
          //使用alibaba的工具包
          String jsonString = JSONObject.toJSONString(error);
  
          //响应给浏览器
          response.getWriter().write(jsonString);
          return false; //否则代码会继续执行
      }
      //6.解析.令牌成功 直接放行
      log.info("令牌合法");
      return true;
  }
  ```

  ```java
  //WebConfig
  @Configuration
  public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;
  
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**");
        //注册了一个拦截器
        // /** 表示所有资源
    }
  }
  ```





## 10.11.*全局异常处理器

```java
/**
 * 全局异常处理器
 */
@SuppressWarnings("ALL")
@RestControllerAdvice
//@RestControllerAdvice = @ControllerAdvice + @ResponseBody
//@ResponseBody 会将方法的返回值转换为json
public class GlobalExceptionHandler {
    //@ExceptionHandler(Exception.class) // 全部异常的处理
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class) //只针对SQL语句异常的处理
    //指明我们需要捕获哪些异常
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("对不起,操作失败,请联系管理员!");
    }
}
```





# 11.事务管理&AOP

## 11.1.*Spring事务管理

- 事务是一组操作的集合,它是一个不可分割的工作单位,这些操作 要么同时成功,要么同时失败

- **@Transactional注解:**

  1. 位置:业务层(serice)层的方法上,类上,接口上

  2. 作用:将当前方法交给spring进行事务管理,方法执行前,开启事务;成功执行完毕,提交事务;出现异常,自动回滚事务

  3. 可以定义在**类和接口上**

     ```java
     //一般在执行数据层进行多次的增删改的业务方法上进行添加
     @Transactional //用来进行事务管理
     @Override
     public void delete(Integer id) {
         deptMapper.deleteById(id);
         empMapper.deleteByDeptId(id); // 根据部门id去删除该部门下的员工
     }
     //Service层
     ```

     ```yml
     #spring事务管理日志
     logging:
       level:
         org.springframework.jdbc.support.JdbcTransactionManager: debug
     ```

- @Transactional的使用细节

  - rollbackFor

    **默认情况下,只有出现RuntimeException才回滚异常,robbackFor属性用于控制出现何种异常类型,才会回滚异常**

    ```java
    //一般在执行数据层进行多次的增删改的业务方法上进行添加
    //@Transactional() //用来进行事务管理
    @Transactional(rollbackFor = Exception.class) //表示出现所有异常都会进行回滚
    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
        empMapper.deleteByDeptId(id); // 根据部门id去删除该部门下的员工
    }
    ```

  - propagation

    **事务传播行为:指的就是一个事物方法被另一个事务方法调用时,这个事务方法应该如何进行事务控制**

    | 属性值        | 含义                                                         |
    | ------------- | ------------------------------------------------------------ |
    | REQUIRED      | [默认值]需要事务,有则加入,无则创建新事务                     |
    | REQUIRES_NEW  | 需要新事物,无论有无,总是创建新事务                           |
    | SUPPORTS      | 支持事务,有则加入,无则在无事务状态中运行                     |
    | NOT_SUPPORTED | 不支持事务,在无事务状态下运行,如果当前存在已有事务,则挂起当前事务 |
    | MANDATORY     | 必须有事务,否则抛异常                                        |
    | NEVER         | 必须没事务,否则抛出异常                                      |

    ```java
    @Transactional //表示出现所有异常都会进行回滚
    @Override
    public void delete(Integer id) {
      try{
        deptMapper.deleteById(id);
      	int i = 1/0 ;//报错
        empMapper.deleteByDeptId(id); // 根据部门id去删除该部门下的员工
      }finally{
        DeptLog deptlog = new DeptLog();
        deptlog.setCreateTime(LocalDataTime.now());
        deptlog.setDescription("执行了解散部门");
        deptLogService.insert(deptLog);
      }
    }
    
    @Transactional(propagation = Propagation.REQUIRES.NEW)
    //表示这是创建了一个新的事务,原来的那个事务已经挂载,正在执行新的这个事务
    //这个新的事物只要不报错 就会自动提交事务
    //原来的那个事务由于报错 会自动进行回滚
    
    //如果这个事务传播行为默认值
    //就说明调用这个方法的如果有事 务 那么就加入这个事务
    //如果没有 就自动创建一个新的事务
    public void insert(DeptLog deptLog){
      deptLogMapper.insert(deptLog);
    }
    ```

    REQUIRED:大部分情况下都是用该传播行为即可

    REQUIRED_NEW:当我们不希望事物之间相互影响时,可以使用该传播行为,比如:下订单前需要记录日志,不论订单保存与否,都需要保证日志能够记录成功



## 11.2.AOP基础

- AOP:Aspect Oriented Programming(面向切面编程,面向方法编程),其实就是面向特定方法编程.

- 实现:

  - 动态代理是**面向切面编程最主流的实现**,而SpringAOP是Spring框架的高级技术,旨在管理bean对象的过程中,主要通过**底层的动态代理机制**,对特定的方法进行编程

- 快速入门

  ```xml
  <!--  1  SpringAOP的依赖-->
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-aop</artifactId>
  </dependency>
  ```

  ```java
  //   2
  @Slf4j
  @Component
  @Aspect //AOP类
  public class aop {
    @Around("execution(* com.it117.spring_boot_tlias.service.*.*(..))") //切入点表达式
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //1.记录开始时间
        long begin = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();//运行原始的方法 抛出异常
      	//只有Around需要调用这个方法
        //这个result表示的是原始方法的返回值
      
        long end = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature()+"方法执行耗时:{}ms", end-begin);
        return result;
    }
  }
  
  ```

- AOP的应用场景:记录操作日志,权限控制,事务管理…..

- AOP的优势:代码无侵入,减少重复的代码,提高开发效率,维护方便

- AOP的核心概念:

  - 连接点:JoinPoint,可以被AOP控制的方法(暗含方法执行时的相关信息)

  - 通知:Advice ,只哪些重复的逻辑,也就是共性功能(最终体现为一个方法)

  - 切入点:PointCut,匹配连接点的条件,通知仅会在切入点方法执行时被应用(通过切入点表达式来体系切入点)

    ` @Around("execution(* com.it117.spring_boot_tlias.service.DeptServiceImpl.list())")//表示只有这个list方法是这个通知的切入点`

  - 切面:Aspect,描述通知与切入点的对应关系(通知+切入点)

  - 目标对象:Target,通知所应用的对象

    ![image.png](https://s2.loli.net/2024/03/19/uSyFgXRtI7sr5OJ.png)

- AOP执行流程

  ![image.png](https://s2.loli.net/2024/03/19/CHEtuqaLTyPDRv4.png)

  **在对象运行的时候,会对目标对象自动生成一个对应的代理对象,这个代理对象就会对原始对象的方法的功能进行增强,最后这个IOC容器注入时候就不是再注入原来的目标对象,而是注入这个代理对象**

  **运行不是目标对象,而是代理对象**



## 11.3.AOP进阶

- 通知类型

  1. @Around:环绕通知,此注解标注的**通知方法在目标方法前,后都被执行**
  2. @Before:前置通知,此注解的通知方法**在目标方法前被执行**
  3. @After:后置(最终)通知,**此注解标注的通知方法在目标方法后被执行,无论是否异常都会执行**
  4. @AfterReturning:返回后通知,此注解标注的通知方法在目标方法后被执行,**有异常不会执行**
  5. @AfterThrowing:异常后通知,此注解标注的通知方法**发生异常后执行**
  6. **@Around环绕通知需要自己调用ProceedingJoinPoint.proceed()来让原始方法执行,其他通知不需要考虑目标方法执行**
  7. @Around环绕**通知方法的返回值,必须指定为Object,来接受原始方法的返回值**

- PointCut

  抽取重复的切入点表达式

  ```java
  public class aop {
    @Pointcut("execution(* com.it117.spring_boot_tlias.service.*.*(..))")
    private void pt(){} //如果设为公共的方法 可以在其他方法也调用这个切入点表达式
  	//@Around("execution(* com.it117.spring_boot_tlias.service.*.*(..))") //切入点表达式
    @Around("pt()")
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //1.记录开始时间
        long begin = System.currentTimeMillis();
        System.out.println("1");
        Object result = proceedingJoinPoint.proceed();//运行原始的方法 抛出异常
        //这个result表示的是原始方法的返回值
        long end = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature()+"方法执行耗时:{}ms 2", end-begin);
        log.info(proceedingJoinPoint.getSignature()+"方法执行耗时:{}ms 3", end-begin);
        return result;
    }
  
    @Before("pt()")
    public void before(){
        System.out.println("before.....");
    }
  }
  ```

- 通知执行顺序

  1. 不同切面类中,默认按照切面类的类名字母排序:
     1. 目标方法前的通知方法,字母排名靠前的先执行
     2. 目标方法后的通知方法,字母排名靠前的后执行
  2. 用@Order(数字)加在切面类上来控制顺序
     1. 目标方法前的通知方法,数字小的先执行
     2. 目标方法后的通知方法,数字小的后执行

- 切入点表达式

  - 切入点表达式:描述切入点方法的一种表达式

  - 作用:主要用来决定项目中的哪些方法需要加入通知

  - 常见形式:

    1. execution(….):根据方法的签名来匹配

       ```java
       @Around("execution(* com.it117.spring_boot_tlias.service.*.*(..))")
       ```

       execution(访问修饰符 ?  返回值   包名.类名.?   方法名(方法参数)   throws 异常?)

       - 访问修饰符:可省略(public,protected)
       - 包名.类名:可省略(**不建议省略,可能由于匹配的范围过大,导致匹配到其他的方法**)
       - throws 异常:可省略 (是方法上声明抛出的异常不是实际抛出的异常)

    2. @annotation(……):根据注解匹配

  - @execution使用通配符描述切入点

    - *:**单个独立的任意符号**,可以通配任意返回值,包名,类名,方法名,任意类型的一个参数,也可以通配包,类,方法名的一部分

      execution(* com.*.service.\*update\*(\*))

    - ..:**多个连续的任意符号**,可以通配任意层级的包,或任意类型 ,任意个数的参数

      execution(\* com.service..DeptService.*(..))

    - execution(\* com.service.\*Service.delete*(\*))

      表示在service包下以Service结尾的java文件中的以delete开头的方法中要含有一个参数,才能匹配成功

    - ||的使用

      ```java
      @Pointcut("execution(* com.it117.spring_boot_tlias.service.DeptService.delete()) ||" +
          "execution(* com.it117.spring_boot_tlias.service.DeptService.list())")
      //这个表达式的意思为只有匹配到第一个或者第二个 都会执行这个aop
      private void pt(){}
      
      @Before("pt()")
      public void before(){
          System.out.println("before.....");
      }
      ```

      **根据业务需求,可以使用  &&  ||  !  等来组合比较复杂的切入点表达式**

    - 书写建议:

      1. 所有业务方法名在命名时尽量规范,方便切入点表达式快速匹配<如:查询类方法都是find开头,更新类方法是update开头
      2. 描述切入点方法通常**基于接口描述**,而**不是直接描述实现类,**增强拓展性
      3. 在满足业务需要的前提下,**尽量缩小切入点的匹配范围**如:包名匹配尽量不使用..,使用*匹配当个包

  - @annotion切入点表达式,用于匹配标识有特定注解的方法

     ```java
     @Before("@annotion(com.itheima.anno.Log)")
     public void before(){
     	log.info("before..")
     }
     ```

    ```JAVA
    //Retention 用来描述这个注解什么时候生效
    @Retention(RetentionPolicy.RUNTIME) //在程序运行时有效
    @Target(ElementType.METHOD) // 作用于方法上 指定在哪些地方
    public @interface MyLog {
     //
    }
    ```

    ```JAVA
    @Slf4j
    @Aspect
    @Component
    public class MyAspect {
        @Pointcut("@annotation(com.it117.spring_boot_tlias.aop.MyLog)")
        private void pt(){}
    
        @Before("pt()")
        private void before(){
            log.info("MyAspect.." );
        }
    }
    ```

    ```java
    @MyLog
    public void delete(Integer id) {
        deptMapper.deleteById(id);
        empMapper.deleteByDeptId(id); // 根据部门id去删除该部门下的员工
    }
    ```

- 连接点

  - 在Spring中用JointPoint抽象了连接点,用它可以获得相关的方法执行时的相关信息,如目标类名,方法名,方法参数等

    - **对于@Around通知,获取连接点信息只能使用ProceedingJointPoint类** 
    - 对于其他四种通知,**获取连接点信息只能使用JoinPoint类**,它是ProceedingJoinPoint的父类型

    ```java
    @Slf4j
    @Component
    public class MyAspect2 {
    	@Pointcut("execution(* com.it117.spring_boot_tlias.service.DeptService.*(..))")
      private void pt(){}
    
      @Before("pt()")
      public void before(){
          log.info("MyAspect2");
      }
      
      @Around("pt()")
      public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
          log.info("MyAspect2 around before..." );
    
          // 1.获取 目标对象的类名
          String stringName = proceedingJoinPoint.getTarget().getClass().getName();
          log.info("获取对象的类名为:{}",stringName);
    
          // 2.获取 目标方法的方法名
          String methodName = proceedingJoinPoint.getSignature().getName();
          log.info("目标方法的方法名:{}", methodName);
    
          // 3.获取 传入的参数
          Object[] args = proceedingJoinPoint.getArgs();
          log.info("目标方法运行时传入的参数:{}", Arrays.toString(args));
    
          // 4.放行 目标方法运行
          Object object = proceedingJoinPoint.proceed();
    
          // 5.获取 目标方法的返回值
          log.info("目标方法的返回值:{}", object);
    
          return null;
      }
    }
    ```

    **ProceedingJoinPoint和JoinPoint的方法是一致的**
    
    **获取request对象,从请求头中获取到JWT令牌,解析令牌获取出当前用户的ID**









# 12.Web原理

## 12.1.Spring配置优先级

- SpringBoot中支持三种格式的配置文件:

  properties > yml > yaml 

  **项目主流为配置yml**

- SpringBoot还支持java系统属性和命令行参数的方式进行属性配置

  - java系统属性

    ```yml
    -Dserver.port = 9000
    ```

  - 命令行属性

    ```yml
    --server.port = 10010
    ```

  - 命令行属性 > java系统属性

    ```shell
    java -Dserver.port=9000 -jar spring_boot_tlias-0.0.1-SNAPSHOT.jar --server.port=10010
    ```

  - 命令行属性 > java系统属性 >properties > yml > yaml 



## 12.2.*Bean管理

- 获取Bean对象

  ```java
  @SpringBootTest
  class SpringbootWebConfig2ApplicationTests {
  
  @Autowired
  private ApplicationContext applicationContext; // IOC容器对象
  
  // 获取bean对象
  @Test
  public void testGetBean(){
  
      // 根据bean的名称获取
      DeptController bean1 = (DeptController) applicationContext.getBean("deptController");
      System.out.println(bean1);
      // com.itheima.controller.DeptController@7c3c453b
      // 直接获取的为Object对象 需要进行强转
  
      // 根据bean的类型获取
      DeptController bean2 = applicationContext.getBean(DeptController.class);
      System.out.println(bean2);
      // com.itheima.controller.DeptController@7c3c453b
  
      // 根据bean的名称 及 类型获取
      DeptController bean3 = applicationContext.getBean("deptController", DeptController.class);
      System.out.println(bean3);
      // com.itheima.controller.DeptController@7c3c453b
  }
  }
  ```

  - 根据name获取bean: Object getBean(String name)
  - 根据类型获取bean:\<T> T getBean(Class\<T> requiredType)
  - 根据name获取bean(带类型转换):\<T> T getBean(String name, Class\<T> requiredType)
  - **Spring项目启动时,会把其中的bean都创建好,还会受到作用域及延迟初始化影响,这里主要针对于默认的单例非延迟加载的bean而言**

- Bean作用域

  - Spring支持五种作用域,后三种在web环境中生效

    | 作用域      | 说明                                    |
    | ----------- | --------------------------------------- |
    | singleton   | 容器内同 名称 的bean 只有一个实例(默认) |
    | prototyope  | 每次使用该bean时会创建新的实例(非单例)  |
    | request     | 每个请求范围内会创建新的实例(web)       |
    | session     | 每个会话范围内会创建新的实例(web)       |
    | application | 每个应用范围内会创建新的实例(web)       |

  - 可以通过@Scope注解来进行配置

    ```java
    @Lazy
    // 延迟实例对象的初始化 默认为启动IOC容器进行初始化
    // 这个延迟到了 使用这个对象 才会进行初始化
    @Scope("prototype")
    @RestController
    @RequestMapping("/depts")
    public class DeptController {
    }
    ```

  - 默认singleton的bean,在容器启动时被创建,可以使用@Lazyh注解来延迟初始化(延迟到第一次使用的时候)

  - prototype的bean,每一次使用该bean的时候都会创建一个新的实例

  - 实际开发当中,绝大部分的Bean是单例的,也就是说绝大部分Bean不需要配置scope属性

- 第三方Bean

  如果要管理的Bean对象来自于第三方(不是自定义),是无法使用@Component 及衍生注解声明Beand ,就需要@Bean注解

  若要管理的第三方Bean对象,建议对这些bean进行集中分类配置,可以通过@Configuration注解声明一个配置类

  ```java
  @SpringBootApplication
  public class SpringbootWebConfig2Application {
  
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfig2Application.class, args);
    }
  
    // 声明第三方Bean
    @Bean // 将当前对象的返回值对象交给IOC容器管理,称为IOC容器的bean
    public SAXReader saxReader(){
        return new SAXReader();
    }
    // 这样会影响 启动类的纯粹性
  }
  ```

  ```java
  @Configuration // 配置类
  public class commonConfig {
  
    // 声明第三方Bean
    @Bean // 将当前对象的返回值对象交给IOC容器管理,称为IOC容器的bean
    public SAXReader saxReader(DeptService deptService){
      // 这里输入的形参DeptService 是如果这个bean需要依赖其他的bean对象
      // 直接在方法中设置形参即可 容器会根据类型进行自动装配
      // Bean对象默认为方法名 也就是这个saxReader
        return new SAXReader();
    }
  
  }
  ```

  - 通过@Bean注解的name和value属性可以声明bean的名称,如果不指定,默认bean的名称就是方法名
  - 如果第三方bean需要依赖其它bean对象,直接在bean定义方法中设置形参即可,容器会根据类型自动装配
  - 项目中自定义的,使用@Component及其衍生注解
  - 项目中引入第三方的,使用@Bean注解







## 12.3.Spring原理

- 起步依赖
  - 原理:**Maven的依赖传递**



### 12.3.1.自动配置

- 自动配置

  SpringBoot的自动配置就是当spring容器启动后,一些配置类,bean对象就自动存入到了IOC容器中,不需要我们手动去声明,从而简化了开发,省去了繁琐的配置操作

- 自动配置原理

  - 方案一:@ComponentScan组件扫描

    ```java
    @ComponentScan({“com.example”},{“com.itheima”})
    @SpringBootApplication
    public class SpringbootWebConfig2Application{
      
    }
    //繁琐 性能低
    ```

  - 方案二:@Import导入,使用@Import导入的类会被Spring加载到IOC容器中,导入的形式主要有以下几种:

    1. 导入 普通类

    2. 导入 配置类

    3. 导入 ImportSelector 接口实现类 

    4. 使用@EnableXxxx注解,封装@Import注解

       ```java
       // 1.
       @Import({TokenParser.class,HeaderConfig.class})
       // 导入普通类,交给IOC容器管理
       @SpringBootApplication
       @SpringBootApplication
       public class SpringbootWebConfig2Application {
           public static void main(String[] args) {
               SpringApplication.run(SpringbootWebConfig2Application.class, args);
           }
       }
       ```

       ```java
       // 2.
       
       //	@Import({HeaderConfig.class}) 
       //	导入配置类,交给IOC容器管理
       @SpringBootApplication
       public class SpringbootWebConfig2Application {
           public static void main(String[] args) {
               SpringApplication.run(SpringbootWebConfig2Application.class, args);
           }
       }
       ```

       ```java
       // 3.
       //	@Import({MyImportSelector.class}) 
       //	导入ImportSelector接口实现类
       @SpringBootApplication
       public class SpringbootWebConfig2Application {
           public static void main(String[] args) {
               SpringApplication.run(SpringbootWebConfig2Application.class, args);
           }
       }
       ```

       ```java
       //4.
       public class MyImportSelector implements ImportSelector {
           public String[] selectImports(AnnotationMetadata importingClassMetadata) {
               return new String[]{"com.example.HeaderConfig"};
               // @Configuration, ImportSelector, ImportBeanDefinitionRegistrar, or regular component classes to import.
               // 可以将需要加载的类 定义在一份文件中 然后读取这份文件 将文件中的字符串读取出来 封装到这个String[]数组中
               // 最终这些类都会被加载到IOC容器中
           }
       }
       //MyImportSelector.java
       ```

       ```java
       @Retention(RetentionPolicy.RUNTIME)
       @Target(ElementType.TYPE)
       @Import(MyImportSelector.class) // 指定我们要导入哪些类
       public @interface EnableHeaderConfig {
       }
       //EnableHeaderConfig.java
       ```

       ```java
       // 4.
       @EnableHeaderConfig // 相当于导入了 @Import(MyImportSelector.class) 对应的bean和配置类
       /**
        * @Configuration, ImportSelector, ImportBeanDefinitionRegistrar, or regular component classes to import.
        * 可以导入这些类:@Configuration注释的类,ImportSelector,ImportBeanDefinitionRegistrar这俩种接口实现的类
        * 或者是普通类
        */
       @SpringBootApplication
       public class SpringbootWebConfig2Application {
           public static void main(String[] args) {
               SpringApplication.run(SpringbootWebConfig2Application.class, args);
           }
       }
       ```

  ```java
  // 自动配置的源码跟踪
  public class ConfigTest {
  /**
  * @SpringBootConfiguration
  * @EnableAutoConfiguration // 这个注解为自动配置的核心
  * @ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
  *                @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
  * public @interface SpringBootApplication {
  *
  *  1. 根据这个@EnableAutoConfiguration我们可以得知 这个注解是用来自动配置类的
  *
  *  2. 直接进入@EnableAutoConfiguration的源代码
  */
  
  /**
  * @AutoConfigurationPackage
  * @Import(AutoConfigurationImportSelector.class)
  * public @interface EnableAutoConfiguration {
  *
  *  3. 进入到了@EnableAutoConfiguration的源代码
  *  我们可以看见这个EnableAutoConfiguration
  *  注解了@Import(AutoConfigurationImportSelector.class)
  *  说明这个注解导入了AutoConfigurationImportSelector这个实现类
  *
  *  4.继续跟进AutoConfigurationImportSelector这个实现类
  *
  */
  
  /**
  * public class AutoConfigurationImportSelector implements DeferredImportSelector, BeanClassLoaderAware,
  * 		ResourceLoaderAware, BeanFactoryAware, EnvironmentAware, Ordered {
  *      ......
  *        @Override
  *    public String[] selectImports(AnnotationMetadata annotationMetadata) {
  * 		if (!isEnabled(annotationMetadata)) {
  * 			return NO_IMPORTS;
  *        }
  * 		AutoConfigurationEntry autoConfigurationEntry = getAutoConfigurationEntry(annotationMetadata);
  * 		return StringUtils.toStringArray(autoConfigurationEntry.getConfigurations());
  			// 这个方法的返回值 表示我需要将哪些类交给IOC进行管理
  *
  * 	    5.  selectImports这个方法是用来返回配置类的
  * 	    根据这个类的返回值可以看出autoConfigurationEntry是由于getAutoConfigurationEntry(annotationMetadata)
  *     才得到的
  *
  *      6. 我们继续跟进这个getAutoConfigurationEntry方法
  *    }
  */
  
  
  /**
  * protected AutoConfigurationEntry getAutoConfigurationEntry(AnnotationMetadata annotationMetadata) {
  * 		if (!isEnabled(annotationMetadata)) {
  * 			return EMPTY_ENTRY;
  *                }
  * 		AnnotationAttributes attributes = getAttributes(annotationMetadata);
  * 		List<String> configurations = getCandidateConfigurations(annotationMetadata, attributes);
  * 		.....
  * 		return new AutoConfigurationEntry(configurations, exclusions);*    }
  * 	    7. getAutoConfigurationEntry这个方法的返回值为	AutoConfigurationEntry方法调用的返回值
  * 	       而这个AutoConfigurationEntry调用的参数configurations为配置类
  * 	       configurations是一个List数组 这个数组是由getCandidateConfigurations这个方法调用得到的
  * 	       我们需要进入getCandidateConfigurations这个方法的源代码寻找自动配置类
  */
  
  /**
  *
  */
  
  /**
  * protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
  * 		List<String> configurations = new ArrayList<>(
  * 				SpringFactoriesLoader.loadFactoryNames(getSpringFactoriesLoaderFactoryClass(), getBeanClassLoader()));
  * 		ImportCandidates.load(AutoConfiguration.class, getBeanClassLoader()).forEach(configurations::add);
  * 	    Assert为断言方法
  * 		Assert.notEmpty(configurations,
  * 				"No auto configuration classes found in META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports. If you "
  * 						+ "are using a custom packaging, make sure that file is correct.");
  * 		return configurations;
  *        }
  *
  *      8. 这个断言输出的语句为"No auto configuration classes found in META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports. If you "
  *      					+ "are using a custom packaging, make sure that file is correct.");
  *      这个语句告诉我们自动配置类在 META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports.
  *      这俩个文件中
  *
  *      9. 当这个配置信息加载出来之后 就会返回给configurations这个List集合
  *      最终返回到了String[] selectImports这个方法的数组中
  *      这个String[]类型中的数据 最终要加载到IOC容器中的Bean和配置类中
  */
  
  /**
  *      10. 这两份文件都在起步依赖的web文件中存放着
  *          在Maven: org.springframework.boot:spring-boot-autoconfigure:2.7.5的
  *          spring-boot-autoconfigure-2.7.5.jar的
  *          META-INF中的
  *          spring.factories
  *          或
  *          spring目录下的
  *          org.springframework.boot.autoconfigure.AutoConfiguration.imports
  *          这个文件 最终被import读取 然后加载到IOC容器中
  */
  }
  
  ```

  - @SpringBootConfiguration:该注解与@Configuration注解作用相同,用来声明当前也是一个配置类
  - @ComponentScan:组件扫描.默认扫描当前引导类所在及其子包
  - @EnableAutoConfiguration:SpringBoot实现自动化配置的核心注解
  - @@ConditionalOnClass是按一定条件才会去注入这个Bean对象到IOC容器中



### 12.3.2.@Conditional

- 作用:按照一定的条件进行判断,在满足给定的条件后才会注册对应的Bean对象到Spring IOC容器中

- 位置:方法 或  类

- @Conditional本身是一个父注解,派生出大量的子注解

  - @ConditionalOnClass**:判断环境中是否有对应的字节码文件,才注册Bean到IOC容器中**

    ```java
    @Bean
    @ConditionalOnClass(name = "io.jsonwebtoken.Jwts")
    //如果当前环境中没有io.jsonwebtoken.Jwts这个字节码文件 就不会加载这个headerParser类 
    public HeaderParser headerParser(){
        return new HeaderParser();
    }
    ```

  - @ConditionalOnMissingBean:**判断环境中没有对应的Bean(类型或名称),才注册Bean到IOC容器中**

    ```java
    @Bean
    @ConditionalOnMissingBean 
    // 不存在该类型的Bean 才会将该Bean加入到IOC容器中
    // --指定类型(使用value)
    // --指定名称(使用name )
    // 如果你声明过了这个Bean对象就使用你声明的这个Bean对象
    // 如果你没有声明 但是还想使用这个Bean对象就需要使用
    // 我这个声明的对象了
    public HeaderParser headerParser(){
        return new HeaderParser();
    }
    ```

  - @ConditionalOnProperty:**判断配置文件中有对应属性和值,才注册Bean到IOC容器中**

    ```java
    @Bean
    @ConditionalOnProperty(name = "name",havingValue = "it117")
    // 表示是否在配置文件(也就是application.yml这个配置文件 中是否含有 name:it117
    // 如果没有就不会声明这个Bean 有了才会声明这个Bean
    public HeaderParser headerParser(){
        return new HeaderParser();
    }
    ```



### 12.3.3.*自定义起步依赖starter

- 实际开发中,经常会自定义一些公共组件,提供给各个项目团队使用,而在SpringBoot的项目中,一部会将这些公共组件封装为SpringBoot的starter

  ![image.png](https://s2.loli.net/2024/03/21/lJThFoOmNbGQI4v.png)

- 步骤

  ![image.png](https://s2.loli.net/2024/03/21/gbZtToS3OBkHvlp.png)

```shell
mvn idea:module
# Springboot中不含有iml文件
# 在该文件的目录下的cmd控制台输入这串命令
```

```java
// https://start.aliyun.com 这个解决https://start.spring.io 超时的问题
```







### 12.3.4.*Web总结

![image.png](https://s2.loli.net/2024/03/22/zSUheRQDm4aHijY.png)



![image.png](https://s2.loli.net/2024/03/22/D6zlPTHC3Umws8c.png)





[^ending]:2024-3-22

