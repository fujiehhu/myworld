$(function () {


    var data = [];

    for (i = 0; i < 20; i++) {
        data.push("5" + i);

    }

    // append/prepend 是在选择元素内部嵌入。
    // after/before 是在元素外面追加。
    for (i = 0; i < data.length; i++) {
        var txt = '<li><a href="#nogo">' + data[i] + '</a></li>';
        $("#ele").append(txt);
    }

    $(".search_sort a").click(function () {
        // console.log("dianjiel");
        alert($(this).text())
        // $("#res").text($(this).text())
    });
});