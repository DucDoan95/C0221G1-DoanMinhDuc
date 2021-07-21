// console.log("Start");
// let promiseObj = new Promise((resolve, rejects) => {
//     let xHttp = new XMLHttpRequest()
//     xHttp.onload = function () {
//         if (this.status == 200) {
//             resolve(xHttp.responseText);
//         } else {
//             rejects("Error call API")
//         }
//     };
//     xHttp.open("GET", "https://api.github.com/search/repositories?q=angular")
//     xHttp.send();
// });
// promiseObj.then((result) => {
//     console.log("OK")
//     console.log((result));
// }, (error) => {
//     console.log("Pending")
// }).finally(() => console.log("End"));

console.log("Start");
async function test() {
    let rs;
    let xHttp = new XMLHttpRequest();
    xHttp.onload = function () {
        if (this.status == 200) {
            rs = (xHttp.responseText);
        } else {
            rs= ("Error call API");
        }
    };
    xHttp.open("GET", "https://api.github.com/search/repositories?q=angular")
    xHttp.send();
    rs = await xHttp;
    return rs;
}
test().then((result) => {
    console.log("OK")
    console.log(result)
}, (error) => {
    console.log("Pending")
}).finally(() => console.log("End"));

