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
        $.ajax({
            url: "../login", data: paras, success: function (result) {
                // $("#div1").html(result);
                // alert("向后台传数据")
                console.log(result);
            }
        });
    });


});
