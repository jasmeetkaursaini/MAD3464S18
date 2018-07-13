//: Playground - noun: a place where people can play

import UIKit


var str = "Hello, playground"
print("Value of str",str)

var number = 10
print("Number = ",number)
//OR if you wanna execute declaration n printing on the same line ; is needed
var num = 10; print("Number = ",num)

//str = 20
print("Jasmeet","Saini",separator: "_")

var sum = number + 20
//String interpolation
print("Sum of \(number) and 20 is \(sum)")

print("😋","🤓",separator:"🕰")

var happy = "😀"
print("Happy : \(happy)")

var temp : Int
temp = 30
print("Temperature : \(temp) cloudy")

if temp < 10
{
    print("Cold")
}else if temp == 30
{
    print("Hot")
}else{
    print("Heat alret")
}


var PIs : Float = 3.1429
print("PT = \(PIs)")
//OR Declaring let valur will be same throughout the program
let PI : Float = 3.1429
print("PT = \(PI)")
//PI = 2.344

//value might contain nil value so we put ? mark
var task : String?
task = "Writing"
if task == nil{
    print("Yay...no task")
}else{
    print(task!)  //Wrap value in the string
}

//If variable will not contain any value
var tasks : String?
print(tasks)


//To display different task in loop
var tasklist : [String]
tasklist = ["Singing", "Dancing","Writing","Eating","Sketching"]

for activity in tasklist {
    print("Perform \(activity)")
    
}

var itr = 1
while (itr < 5){
    print("Itr : \(itr)")
    itr = itr + 1
}

itr = 10
repeat{
    print("Itr : \(itr)")
    itr = itr + 10
}while(itr <= 30)

itr = 10
switch itr {
case 1...9:
    print("One to nine")
case 10:
    print("Ten")
    fallthrough
case 20:
    print("Twenty")
case 30,40,50:
    print("Thirty or Forty or Fifty")
case 60..<100:     //Instead of dot put < to reach till 99
    print("Sixty to hundard")
default:
    print("Unreachable")
}









