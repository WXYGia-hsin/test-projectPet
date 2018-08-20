$.get("../commons/top.html",function(date){
    $("#top").html(date);
});
// var LOGIN_URL="http://localhost:8080/account/login";
// $(function(){
//
//        $("#btn").click(function(){
//            alert(1);
//            $.ajax({
//             url:LOGIN_URL,
//             dataType:"json",//后端往前端传的数据
//             data:JSON.stringify($("#form1").serializeObject()),//前端往后端传数据
//             type:"post",//提交方法
//             contentType:"application/json",//前端往后端传送数据类型
//             statusCode:{
//                 200:function(data){
//                     alert(data);
//                 },
//                 409:function(data){
//                     alert("登录失败！");
//                 }
//             }
//
//         });
//     });
//
// });