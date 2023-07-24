# 마크다운 간단 문법

# h1
## h2
### h3
#### h4
##### h5
###### h6

Mark
====
down
---


# 수평선(빼기 3개는 수평선이 됨)
---
***
___


# 목록(순서 有, 순서 無 경우)
## 순법이 있는 목록(ol)
1. Python
2. Java

## 순법이 없는 목록(ul)
- 국어
- 수학
- 영어
* 음악
+ 체육


# 들여쓰기 표현
aaaaaaaaaaaaaa

     bbbbbbbbbbbbbb
     cccccccccccccc

     
# 코드블럭
```java
여기 안에 있는 건 자바 코드야
```

```java
public class DemoApplication{
     public static void main (String[] args){
          System.out.println("Spring boot App Started")
     }
}
```


# 링크 사용하기

## 기본 링크
[구글바로가기](http://google.com)

## 아이디를 사용하여 보여지는 문자열 표시하기
[구글바로가기][google]   
[google]: http://google.com "Google 사이트로 이동합니다."

## 문서 내부 참조
[문서의 처음으로 이동](#마크다운-간단-문법)


# 강조
Hello *World*   
_Hello_ World   
Hello **World**   
__Hello__ World   
~~Hello~~ World


# 이미지 표현 방법
<img src="서강준.jpg" alt="배경사진" title="바닷가 풍경">

# 인용문(BlockQuote)
아래는 인용문입니다.
> 첫번째 인용문
>> 인용문 안의 인용문
