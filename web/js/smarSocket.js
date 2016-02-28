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
}