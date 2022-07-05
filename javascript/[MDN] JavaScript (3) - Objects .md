# [MDN] JavaScript (3) - Objects

JS에서의 객체는 간단히 이름 - 값 쌍의 모임이다. python의 딕셔너리랑 비슷하다.

빈 객체를 생성하는 두가지 방법

```jsx
//(1)-----------------------
var obj = new Object();

//(2)-----------------------
var obj = {};
```

객체 리터럴 구문으로 객체의 전체적인 구조를 초기화 할 수 있다.

```jsx
const obj = {
  name: 'Carrot',
  _for: 'Max', // 'for'는 예약어이므로, '_for'를 대신 사용합니다.
  details: {
    color: 'orange',
    size: 12
  }
};
```

속성에 연속적으로 접글할 수 있다.

```jsx
obj.details.color; // orange
obj["details"]["size"]; // 12
```

아래는 객체 프로토타입(Person)과 프로토타입의 인스턴스(you)를 생성한다.

```jsx
function Person(name, age) {
  this.name = name;
  this.age = age;
}

// 객체를 정의합니다.
var you = new Person('You', 24);
// "You"라는 이름의 24세인 새로운 사람을 생성 중입니다.
```

객체의 속성에 접근하는 두가지 방법

```jsx
// 점 표기법(dot notation)
obj.name = "Simon"
var name = obj.name;

// 대괄호 표기법(bracket notation)
obj["name"] = "Simon";
var name = obj["name"];
// key를 정의하기 위해 변수도 쓸수 있습니다.
var user = prompt('what is your key?')
obj[user] = prompt('what is its value?')
```

대괄호 표기법은 속성의 이름을 실행 시간에 계산할 수 있는 문자열로 전달 한다. 

### Array

length 속성을 가진다. 항상 배열에서 가장 큰 인덱스보다 하나 더 큰 값을 가진다. 

배열 생성

```jsx
var a = new Array();
a[0] = "dog";
a[1] = "cat";
a[2] = "hen";
a.length // 3
```

더 편리한 배열 표기법은 배열 리터럴 사용하는 것이다. 

```jsx
var a = ['dog', 'cat', 'hen'];
a.length; // 3
```

array.lenth 는 배열이 들어있는 항목의 수가 아님.

```jsx
var a = ['dog', 'cat', 'hen'];
a[100] = 'fox';
a.length; // 101
```

length  속성은 최대 인덱스에 하나를 더한 값일 뿐이다. 

배열에 항목 하나를 추가하고 싶으면 이렇게 하면 됩니다.

```jsx
a.push(item);
```

- 배열 메소드

| 메소드 이름 | 설명 |
| --- | --- |
| a.toString | 각 항목에 대한 출력이 콤마로 구분된 한개의 문자열을 반환 |
| a.toLocaleString | 각 항목에 대한 출력이 콤마로 구분된 한개의 문자열을 반환 |
| a.concat((item1[, item2[, ...[, itemN]]]) | item들이 덧붙여진 한개의 배열을 반환 |
| a.join(sep) | 배열의 값들을 sep인자로 구분하여 합친 한개의 문자열로 변환 |
| a.pop() | 배열의 마지막 항목을 반환하면서 제거 |
| a.push(item1, … , itemN) | 배열의 끝에 item들을 덧붙임 |
| a.shift() | 배열의 첫번째 항목을 반환하면서 제거 |
| a.unshift(item1[, item2[, …[ , itemN]]]) | 배열의 앞쪽에 item들을 덧붙임 |
| a.slice(start[, end]) | 배열의 일부분을 새배열로 반환 |
| a.sort([cmpfn]) | 옵션으로 비교용도의 함수를 입력받음 |
| a.splice(start, delcount[, item1[, …[, itemN]]]) | 배열의 일부분을 제거하고 다른 항목으로 대체하여 배열을 변경 |
| a.reverce() | 배열의 순서를 거꾸로 배열 |