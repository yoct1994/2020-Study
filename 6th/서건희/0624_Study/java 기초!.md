# java 기초!

### java에서의 자료형과 형변환하기

* 자료형의 종류
  * 논리형
    * boolean : 크기-1bit, 기본값-false, 표현 범위-true/false(0과 1이 아니다)
  * 문자형
    * char : 크기-2byte, 기본값-\u0000, 표현범위-0~65,535
  * 정수형
    * byte : 크기-1byte, 기본값-0, 표현 범위-(-128)~127
    * shart : 크기-2byte, 기본값-0, 표현 범위-(-32,768)~32,767
    * int : 크기-4byte, 기본값-0, 표현 범위-(-2147483648)~2147483647
    * long : 크기-8byte, 기본값-0, 표현 범위-(-9,223,372,036,854,775,808)~9,223,036,854,775,807
  * 실수형
    * float : 크기-4byte, 기본값-0.0, 표현 범위-(-3.4E38)~3.4E38
    * double : 크기-8byte, 기본값-0.0, 표현 범위-(-1.7E308)~1.7E308
  * 문자열
    * string
  * 선언 방법 : C와 비슷하다.
  
  ```java
  int a;			//정수형 자료형 선언
  boolean b;		//논리형 자료형 선언
  float c;		//실수형 자료형 선언
  char d;			//문자형 자료형 선언
  ```
  
* 자료형 형변환

  * 문자 -> 숫자

    * String to Int : Integer클래스의 parseInt 함수, valueOf함수로 변환한다.

    ```java
    String s_num = "10";					//문자열 s_num 선언 및 10으로 초기화
    int i_num = Integer.parseInt(s_num);	//정수형 i_num에 문자열 s_num을 형변환 및 초기화
    int i_num2 = Integer.valueOf(s_num);	//위는 parseInt함수 현재는 valueOf로 형변환
    ```

    * String to Double, Float : 자바에서 Long, Double, Float 클래스의 parseLong함수와 valueOf함수로 변환 시켜 줄 수 있다.

    ```java
    String s_num = "10";					//문자열 s_num선언 및 10으로 초기화
    double d_num = Double.valueOf(s_num);	//s_num 
    float d_num = Float.valueOf(s_num);
    ```

    * String to Long, Short : parseLong함수와 parseShort함수로 변환 시켜 줄 수 있다.
    
    ```java
    String s_nun = "10";					//문자열 s_num선언
    long l_num = Long.parseLong(s_num);		//String -> Long
    short sh_num = Short.parseShort(s_num);	//String _> Short
    ```
    
  * 숫자 -> 문자
  
    * int to String : valueOf, toString 함수로 변환 시켜줄 수 있다.
  
    ```java
    int i_num = 10;					//정수형 i_num 선언
    String s_num;					//문자열 s_num 선언
    
    s_num = String.valueOf(i_num);	//문자 -> 정수
    s_num = Integer.toString(i_num);//문자 -> 정수2
    s_num = ""+i_num;				//문자 -> 정수3
    ```
  
    * Double Float to String : valueOf, tostring함수로 치환 할 수 있다.
  
    ```java
    float f_num = 10.10;			//실수형 f_num선언
    double d_num =10.10;			//실수형 d_num선언
    
    String s_num;					//문자열 선언
    
    s_num = String.valueOf(f_num);	//Float -> String 1번
    s_num = Float.toString(f_num);	//Float -> String 2번
    
    s_num = String.valueOf(d_num);	//Double -> String 1번
    s_num = Double.toString(d_num);	//Double -> String 2번
    ```
  
  * 정수 -> 실수
  
    * Double, Float to Int : Int캐스팅 방식으로 변환 실킬 수 있는데 소수점 아래 자리는 버려진다.
  
    ```java
    double d_num = 10.101010;	//실수형 선언
    float f_num = 10.101010;	//실수형 선언
    
    int i_num;					//정수형 선언
    i_num = (int)d_num;			//Int -> Dpuble
    i_num = (int)f_num;			//Int -> Float
    ```
  
    * Int to Double, Float  : Double, Float캐스팅으로 구현 할 수 있다.
  
    ```java
    int i_num = 10;					//정수형 선언
    
    double d_num = (double)i_num;	//Int -> Double
    float f_num = (float)i_num;		//Int -> Float
    ```

---

### 자바의 조건문, 반복문

* 모든것이 C언어와 완벽하게 동일하다.

---

### 자바의 배열

* 배열의 선언 : C언어와는 조금 다르다. 자바는 선언과 생성이 있다는 것이 다르다.

```java
int[] arr;			//배열의 선언
arr = new int[5];	//배열의 크기와 함께 실질적으로 생성
double[] arr1 = new double[5];	//선언과 동시에 생성도 가능, double형 배열 선언 및 생성
char[] arr2 = new char[5];		//char형 배열 선언 및 생성
```

* 배열 초기화 : 배열을 초기화하는 방법은 C언어와 동일하다.

```java
arr[0] = 90;
arr[1] = 80;
```

---

### 자바 문자열 사용법

* 문자열 선언 : String을 이용한다.

```java
String a = "Hello";			//문자열 선언 및 초기화
String b = "java";
```

* 문자열 연결

```java
String text = a + b;		//문자열을 연결할 때  +연산자를 이용한다.
System.out.println(text);	//출력 : Hello Java

String h = "Hello Java";
String s = h.substring(0,5);	//문자열 h에서 0~5번 버퍼까지 출력
```

* 여러 문자열을 연결 : 매우 많은 문자열을 연결할 때에는 +는 성능 문제때문에 좋지 않다. 그래서 StringBuilder()를 이용해 여러개의 문자열을 한번에 잇는다.

```java
StringBuilder sb = new StringBuilder();	//함수 선언
sb.append("Hello").append("Java!");		//함수 sb에 여러 문자열 저장

System.out.println(sb.toString());		//저장된 문자열 출력 결과)Hello Java!
```

* String 객체를 비교할 때는 equals() 메소드를 사용한다. 기본 타입이 같은지 비교할때 사용되는 ==연산자를 사용하면 주소로 비교하기 때문에 잘못된 결과일 수 있다.

```java
String h = "Hello";
String j = "Java!";

if(h.equals(j)){
    System.out.printfln("h와 j는 같은 내용을 가지는 문자열 입니다.");
}
```

---



