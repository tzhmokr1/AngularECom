let sportsOne: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];

/*  
legacy code style
for (let i=0; i<sportsOne.length; i++) {
    console.log(sportsOne[i]);
}
*/


// simplied for loop
for (let i of sportsOne) {
    if (i == "Cricket") {
        console.log(i + "<< My Favorite!");
    }
    else {
        console.log(i);
    }
}