$(function () {
    var usrname = $('#usrname').val();
    var usrpwd = $('#usrpwd').val();
    $("#login").click(function () {
        console.log(usrname);
        console.log(usrpwd);
        var paras = {
            "usrname": usrname,
            "usrpwd": usrpwd
        };
        $.ajax({
            url: "../text/demo_test.txt", success: function (result) {
                // $("#div1").html(result);
                console.log(result);
            }
        });
        // $.ajax({
        //     type: "POST",
        //     url: "/user_checkusername.action", data: "username=zhangsan",
        //     dataType: 'text',
        //     success: function (data) {
        //         alert(data);
        //     },
        //     error: function () {
        //         alert("出错了");
        //     }
        //
        // });
    });


});
