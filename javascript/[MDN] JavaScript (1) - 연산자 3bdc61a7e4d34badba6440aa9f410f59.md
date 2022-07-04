# [MDN] JavaScript (1) - 연산자

JavaScript는 유형 및 연산자, 표준 내장 객체 및 메서드가 있는 다중 패러다임, 동적 언어 이다. 구문은 java 및 c 언어를 기반으로 한다. 이러한 언어의 많은 구조가 js에도 적용된다. js는 class대신 객체 프로토 타입을 사용하여 객체 지향 프로그래밍을 지원한다. 함수는 객체이며, 함수는 실행 가능한 코드를 유지하고 다른 객체와 마찬가지로 전달 될 수 있다.

 js 프로그램은 값을 다루고 해당 값은 모두 타입을 가지고 있다. js의 타입은 다음과 같다. 

- Number
- BigInt
- String
- Boolean
- Function
- Object
    - Function
    - Array
    - Date
    - RegExp(정규식)
- Symbol
- Null
- Undefined

## Numbers(수)

js에서의 수는 -(2^53-1) ~ 2^53-1로 정의된다.  int (정수)가 따로 존재하지 않아서 조심해야한다. 

```jsx
console.log(3 / 2);             // 1.5, not 1
console.log(Math.floor(3 / 2)); // 1
```

“명백한 정수” = “암묵적으로 실수”

```jsx
0.1 + 0.2 == 0.30000000000000004;
```

실제로 정수 값은 32비트 정수로 처리되며 일부 구현은 32 비트 정수가 아닌 숫자에 유효한 명령어를 수행 할 때까지 이러한 방식으로 저장한다. 이는 비트 단위 작업에 중요할 수 있다. 

덧셈, 뺄셈, 계수 연산을 포함하는 표준 산술 연산자가 지원된다. 또한 앞에서 언급하는 것을 깜박 잊은 고급 수학 함수와 상수를 다루기 위한 math 내장 객체가 있다. 

```jsx
Math.sin(3.5);
var circumference = 2 * Math.PI * r;
```

내장함수  parseInt()를 사용하여 문자열을 정수로 변환할 수 있다. 

```jsx
parseInt('123', 10); // 123
parseInt('010', 10); // 10
```

 

문자열 형식이 확실하지 않으면 함수가 “0”으로 시작되는 문자열은 8진수로 “0x”로 시작하는 문자열은 16진수로 계산한다. 

```jsx
parseInt('010');  //  8
parseInt('0x10'); // 16
```

2진수를 정수로 변환

```jsx
parseInt('11', 2); // 3
```

비슷한 내장함수 parseFloat()를 사용하여 부동 소수점 숫자를 파싱 할 수 있다. parseInt()과 달리 parseFloat()는 항상 10진수를 사용한다. 

 

단항연산자 “+”를 사용하여 값을 숫자로 변환 할 수도 있다. 

```jsx
+ '42';   // 42
+ '010';  // 10
+ '0x10'; // 16
```

문자열이 수가 아닌 경우 NaN(Not a Number)로 반환

```jsx
parseInt('hello', 10); // NaN
```

NaN이 연산에 쓰이면? 그대로 NaN이 출력된다. 

```jsx
NaN + 5; // NaN
```

내장함수 Number.isNaN()를 사용하여 NaN 여부를 검사할 수 있다. 

```jsx
Number.isNaN(NaN); // true
Number.isNaN('hello'); // false
Number.isNaN('1'); // false
Number.isNaN(undefined); // false
Number.isNaN({}); // false
Number.isNaN([1]) // false
Number.isNaN([1,2]) // false
```

그냥 isNaN 내장함수를 사용하면 안되니까 주의하자.

```jsx
isNaN('hello'); // true
isNaN('1'); // false
isNaN(undefined); // true
isNaN({}); // true
isNaN([1]) // false
isNaN([1,2]) // true
```

JS는 특별한 값 Infinity와 -Infinity를 가지고 있다.

```jsx
1 / 0; //  Infinity
-1 / 0; // -Infinity
```

내장함수 isFinity()를 사용하여 Infinity, -Infinity, NaN 값을 테스트 할 수 있다. 

```jsx
isFinite(1 / 0);     // false
isFinite(-Infinity); // false
isFinite(NaN);       // false
```

## String

JS에서 문자열은 유니코드 문자들이 연결되어 만들어진 것이다. 

한 개의 문자를 나타내려면 길이가 1인 문자열을 사용하면 된다.

문자열의 길이를 알고싶다면, 문자열의 length 속성을 사용하면 된다. 

```jsx
'hello'.length; // 5
```

### Boolean() 함수

true와 false값을 가질 수 있는 bool type을 가지고 있다. 

1. false, 0, “”, NaN, null, undefined = false
2. 이외의 값 = true

```jsx
Boolean('');  // false
Boolean(234); // true
```

if문을 사용하면 자동으로 bool값으로 변환한다. 

### Variavble (변수)

JS에서 새로운 변수는 let, const, var 로 선언된다. 

- let

**let**을 사용하면 블록 레벨 변수를 선언할 수 있다.  변수가 선언된 블록에서 사용가능.

```jsx
// myLetVariable는 여기에서 보이지 *않습니다*

for (let myLetVariable = 0; myLetVariable < 5; myLetVariable++) {
  // myLetVariable는 여기에서만 사용할 수 있습니다
}

// myLetVariable는 여기에서 보이지 *않습니다*
```

 

- const

**const**는 값이 변경되지 않을 변수를 선언할 수 있게 합니다. 변수가 선언된 블록에서 사용가능.

```jsx
const Pi = 3.14; // 변수 Pi 설정
Pi = 1; // 상수 변수는 변경 할 수 없기 때문에 애러 발생.
```

- var

var은 let, const 가 가지는 제한을 가지지 않는다. 변수가 선언된 함수에서 사용 할 수 있다. 

```jsx
// myVarVariable는 여기에서 사용 할 수 *있습니다*

for (var myVarVariable = 0; myVarVariable < 5; myVarVariable++) {
  // myVarVariable는 함수 전체에서 사용 할 수 있습니다
}

// myVarVariable는 여기에서 사용 할 수 *있습니다*
```

### Operators (연산자)

 JS 연산자로는 +, -, *, /, % 가 있다. 

값은 = 로 할당할 수 있고 +=, -= 사용가능하다. 

```jsx
x += 5;
x = x + 5;
```

++, — 를 전처리, 후처리 연산자로 사용가능하다. 

문자열에 어떤 수를 더하면 모두 문자열로 바뀌게 된다.

```jsx
'3' + 4 + 5;  // "345"
 3 + 4 + '5'; // "75"
```

비교는 <, >, ≤, ≥를 통해 가능하다. 이중 등호(==)는 서로 다른 타입을 비교할 경우 타입 강제 변환을 수행하기 때문에 다음과 같이 기대하지 않는 결과를 만들어내기도 한다. 

```jsx
123 == '123'; // true
1 == true;    // true
```

강제 변환을 하지 않게 하려면, 삼중 등호(===)를 사용해야 한다.

```jsx
123 === '123'; // false
1 === true;    // false
```