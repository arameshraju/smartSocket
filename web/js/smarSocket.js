/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

console.log("Test Application");
var socket = new WebSocket("ws://localhost:8084/smartSocket/smartServer");
socket.onmessage = onMessage;
 

function onMessage(event) {
    console.log("Event data :" + event.data);
    socket.send("Thank you I am Working Fine");
    userData();
    TransactionsData();
}

function userData(){
     var userMaster = {
            userName: "Ramesh Raju Alluri",
            email: "fake.email@gmail.com",
            access: "user"
    };
    socket.send(JSON.stringify(userMaster));
}
function TransactionsData(){
     var userTrans = {
            userName: "Ramesh Raju Alluri",
            subscriptions:[ 
                {
                magzine:"Digit",
                validTill:"April-16"
                },
                {
                magzine:"Open Source",
                validTill:"April-18"
                },
                {
                magzine:"PC Quest",
                validTill:"April-17"
                }
        ],
            level: "userLeven"
    };
    socket.send(JSON.stringify(userTrans));
}