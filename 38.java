
/*
람다식(Lambda)

    오늘 배운 내용

이번에는 자바에서 코드를 간결하게 작성할 수 있도록 도와주는
람다식(Lambda)에 대해 배웠다.

람다식은 메서드를 간단한 식으로 표현하는 방법이며,
익명 함수를 작성할 때 사용할 수 있다.

기존에는 인터페이스를 구현하거나 익명 클래스를 만들어야 했지만,
람다식을 사용하면 불필요한 코드를 줄일 수 있다.

특히 Comparator와 같은 함수형 인터페이스와 함께 사용하면
정렬 기준을 간단하게 작성할 수 있다.


    정의

람다식이란 메서드를 간결하게 표현하기 위해 사용하는
자바의 문법이다.

기본 형태

(매개변수) -> { 실행할 코드 }

람다식에서 사용하는 화살표(->)는
매개변수와 실행할 코드를 구분하는 역할을 한다.

람다식은 하나의 추상 메서드만 가진 함수형 인터페이스를
구현할 때 사용할 수 있다.


    사용 방법

1. 기본 람다식

public class Main {
    public static void main(String[] args) {

        Runnable run = () -> {
            System.out.println("람다식 실행!");
        };

        run.run();
    }
}

코드 설명

- Runnable은 하나의 추상 메서드인 run()을 가진 인터페이스이다.
- ()는 매개변수가 없다는 의미이다.
- -> 뒤에 실행할 코드를 작성한다.
- run()을 호출하면 람다식 내부의 코드가 실행된다.


2. 매개변수가 있는 람다식

interface Calculator {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        Calculator cal = (a, b) -> a + b;

        int result = cal.add(10, 20);

        System.out.println(result);
    }
}

코드 설명

- Calculator 인터페이스에는 add()라는 추상 메서드가 있다.
- (a, b)는 두 개의 매개변수를 의미한다.
- -> a + b는 두 값을 더한 결과를 반환한다.
- cal.add(10, 20)을 호출하면 30이 출력된다.

실행할 코드가 한 줄이고 결과를 반환한다면
중괄호와 return을 생략할 수 있다.


3. Comparator와 람다식

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        Collections.sort(numbers, (a, b) -> a - b);

        System.out.println(numbers);
    }
}

코드 설명

- ArrayList에 숫자 3개를 저장한다.
- Collections.sort()에 람다식을 전달한다.
- a - b를 기준으로 오름차순 정렬한다.
- 결과는 [10, 20, 30]으로 출력된다.

참고로 실제 정렬 코드에서는 값의 차이를 직접 계산하기보다
Integer.compare(a, b)를 사용하는 것이 안전하다.


4. forEach()와 람다식

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("철수");
        names.add("영희");
        names.add("민수");

        names.forEach(name -> System.out.println(name));
    }
}

코드 설명

- forEach()는 컬렉션에 저장된 데이터를 하나씩 처리한다.
- name은 현재 처리하는 데이터를 의미한다.
- -> 뒤에 실행할 코드를 작성한다.
- 저장된 이름이 하나씩 출력된다.


    코드 분석

람다식은 기존의 익명 클래스보다 코드를 간결하게 작성할 수 있다.

매개변수가 없는 경우에는 ()를 사용하고,
매개변수가 하나인 경우에는 괄호를 생략할 수도 있다.

실행할 코드가 한 줄이라면 중괄호와 return을 생략할 수 있다.

또한 람다식은 모든 인터페이스에서 사용할 수 있는 것이 아니라
하나의 추상 메서드를 가진 함수형 인터페이스에서 사용할 수 있다.


    알게 된 점

이번 학습을 통해 람다식을 사용하면 기존보다
코드를 짧고 간결하게 작성할 수 있다는 것을 알게 되었다.

특히 Comparator를 사용할 때 익명 클래스로 길게 작성했던
정렬 기준을 람다식으로 간단하게 표현할 수 있다는 점이 편리했다.

또한 람다식은 단순히 코드를 줄이는 기능이 아니라
함수형 인터페이스를 간결하게 구현하기 위한 문법이라는 것을 이해했다.


📌 AI 활용 복습 문제

1) 람다식에서 사용하는 화살표 기호는 무엇인가?

정답: -> 기호를 사용한다.

2) 람다식의 기본 형태는 무엇인가?

정답: (매개변수) -> { 실행할 코드 } 형태이다.

3) 람다식은 어떤 인터페이스에서 사용할 수 있는가?

정답: 하나의 추상 메서드만 가진 함수형 인터페이스에서 사용할 수 있다.

4) 매개변수가 하나인 람다식은 괄호를 생략할 수 있는가?

정답: 가능하다. 예를 들어 x -> x * 2처럼 작성할 수 있다.

5) Comparator와 람다식을 함께 사용하면 어떤 장점이 있는가?

정답: 익명 클래스를 길게 작성하지 않고도
정렬 기준을 간단하게 표현할 수 있다.
*/
