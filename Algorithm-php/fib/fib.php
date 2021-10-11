<?php
/*
 * @Author: onefiter
 * @Date: 2021-10-11 17:36:27
 * @LastEditTime: 2021-10-11 17:55:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Algorithm\fib\fib.php
 */
/**
 *费切那波数列的优化
 */
 function fib1($n) 
 {
    if($n <= 1) return $n;
    return fib1($n - 1) + fib1($n - 2);
     
 }

 function fib2(int $n):int
 {
    if($n <= 1) return $n;
    $first = 0;
    $second = 1;
    for($i=0; $i < $n-1; $i++){
        $sum = $first + $second;
        $first = $second;
        $second = $sum;
    }
    return (int)$second;
     
 }

 function fib3(int $n) :int
 {
    if($n <= 1) return $n;
    $first = 0;
    $second = 1;
    while($n-- > 1){
         $second += $first;
         $first = $second - $first;
    }
     return $second;
 }

 $n = 40;


$t1 =  microtime(true);
echo fib1($n) . "\n" ;
// echo fib2($n);
// echo fib3($n);
$t2 = microtime(true);

$cost_time = $t2 - $t1;
echo $cost_time;