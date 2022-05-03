var sportsOne = ["Golf", "Cricket", "Tennis", "Swimming"];
/*
legacy code style
for (let i=0; i<sportsOne.length; i++) {
    console.log(sportsOne[i]);
}
*/
// simplied for loop
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var i = sportsOne_1[_i];
    if (i == "Cricket") {
        console.log(i + "<< My Favorite!");
    }
    else {
        console.log(i);
    }
}
