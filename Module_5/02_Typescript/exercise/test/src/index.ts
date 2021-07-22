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
    return await new Promise((resolve, rejects) => {
        let xHttp = new XMLHttpRequest()
        xHttp.onload = function () {
            if (this.status == 200) {
                resolve(xHttp.responseText);
            } else {
                rejects("Error call API")
            }
        };
        xHttp.open("GET", "https://api.github.com/search/repositories?q=angular")
        xHttp.send();
    });
}
test().then((result) => {
    console.log("OK")
    console.log(result)
}, (error) => {
    console.log("Pending")
}).finally(() => console.log("End"));

