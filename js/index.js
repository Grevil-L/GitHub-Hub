/*
 index.js
 */

$(document).ready(function () {

    "use strict";
// var msg = "hello JavaScript";
// console.log(msg);
//
// var resultDiv = document.getElementById("results");
// resultDiv.innerHTML = "<p> This is from JavaScript</p>";

    var resultList = $('#resultList');
    resultList.text("This is from jQuery");

    var toggleButton = $("#toggleButton");
    toggleButton.on("click", function () {
        resultList.toggle(500);

        if (toggleButton.text() == "Hide") toggleButton.text("Show");
        else toggleButton.text("Hide");

    });

    var listItems = $("header nav li");
    listItems.css("font-weight", "bold");
    listItems.filter(":first").css("font-size", "18px");


// console.log("msg is " + typeof(msg));
// console.log("resultDiv is " + typeof(resultDiv));
//
// var none;
// console.log("none is " + typeof(none));
//
// var aNumber = 0;
// console.log("aNumber is " + typeof(aNumber));
//
// var trueFalse = true;
// console.log("trueFalse is " + typeof(trueFalse));
//
// var Hello="null";
// console.log("Hello is " + typeof(Hello));
//
// if(!none){
//     console.log("none is undefined");
// }
//
// if (aNumber == "0"){
//     console.log("10 is 10")
// }
//
// function showMsg(msg)
//

    var gitHubSearch = "https://api.github.com/search/repositories?q=jquery+language:javascript&sort=stars";
    $.get(gitHubSearch, function(r){
        //console.log(r.items.length);
        displayResults(r.items);
    });


    // var results = [{
    //     name: "jQuery",
    //     language: "JavaScript",
    //     score: 4.5,
    //     showLog: function () {
    //
    //     },
    //     Owner: {
    //         login: "GrevilLopes",
    //         id: 12345
    //     }
    // },{
    //     name: "jQuery UI",
    //     language: "JavaScript",
    //     score: 3.5,
    //     showLog: function () {
    //
    //     },
    //     Owner: {
    //         login: "GrevilLopes",
    //         id: 12345
    //     }
    // }];

    function displayResults(results){
    resultList.empty();
    $.each(results, function(i, item){

        var newResult = $("<div class='result'>" +
                "<div class='title'>" + item.name + "</div>" +
                "<div>Language: " + item.language + "</div>" +
                "<div>Full name: " + item.full_name + "</div>" +
                "</div>");

        newResult.hover(function () {
            //make it darker
            $(this).css("background-color", "lightgray");
        }, function(){
            //make it lighter
            $(this).css("background-color", "transparent");
        })

        resultList.append(newResult);


    });
    }



});