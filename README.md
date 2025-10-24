# java-racingcar-precourse

# 기능 요구 사항
- **주어진 횟수 동안** n대의 자동차는 전진 또는 멈출 수 있음
- **각 자동차에 이름 부여** - 전진하는 자동차는 출력할 때 이름 같이 출력
- 자동차 이름은 쉼표(,)를 기준으로 구분, 이름은 5자 이하
- 사용자가 몇 번의 이동(횟수)을 할 것인지를 입력할 수 있어야
- 전진하는 조건 : 0~9사이의 숫자 중 무작위 값을 구한 후, 그 값이 4 이상일 경우
- 완료 후 우승자 출력 - 우승자 여러명 가능(쉼표(,)로 구분)
- 에러 - IllegalArgumentException 발생

# 로직 순서
1. 자동차 string, 시도할 횟수 int 형식으로 입력받기
2. 시도할 횟수가 양수 정수인지 확인
   (에러 케이스 : -1 => 시도할 횟수는 양수로 입력해 주세요)
3. 자동차 string을 쉼표 기준으로 split한다.
   (에러 케이스 : string이 쉼표로 끝나는 경우 혹은 이름에 공백이 있는 경우(pobi, jun,) / (pobi,, jun)
                 이름 길이가 5자를 넘을 경우(pobijun, woni)
                 중복된 이름이 있을 경우(pobi, pobi, jun)
4. 입력받은 이름을 바탕으로 Car를 생성
   Car : {"name", "position")
5. Car의 list를
6. 입력받은 횟수만큼 Game을 실행
   Game의 구성 : 각 Car마다 isCarMove()를 실행
                 isCarMove() : Randoms.pickNumberInRange(0, 9);를 실행해서 4 이상이면 position에 '-'추가
                 각 차가 한번씩 isCarMove()를 실행한 후에는 gameResult()를 실행해 준다.
                 gameResult() : Car이름과 position을 한번씩 출력
7. 모든 게임이 끝난 후에는 가장 긴 길이의 position을 찾은 후, 해당 position의 길이와 일치하는 Car의 name을 winnerList에 저장한다.
8. winnerList를 출력한다.

# 설계 구조
|계층|클래스|역할|
|:---:|:---:|:---|
|View|Input, Output|콘솔 입출력 담당|
|Controller|Application, PlayRaceController|'Car생성 -> Game 진행 -> 결과 출력' 흐름 제어|
|Domain|Car, Game, GameResult|Car 객체 생성, 각 회차 당 Game 진행, 각 Game당 Car의 움직임 유무 결정, 각 게임과 최종 게임 결과 판정|


# 구현 기능 목록
- [ ] 입력View : 자동차 이름 문자열, 시도 횟수 정수 입력 기능
   - [ ] 자동차 이름 빈칸 검증 후 split
   - [ ] 시도 횟수 정수 검증 후 반환
- [ ] 출력View
   - [ ] 게임 하나를 마친 후 결과 출력
   - [ ] 모든 게임을 마친 후 우승자 출력
- [ ] Car
   - [ ] CarnameValidater를 호출해 Carname List를 생성 
   - [ ] Car이름 list를 바탕으로 객체 생성
   - [ ] Car의 position을 생성/수정/반환
- [ ] CarnameValidater
   - [ ] 자동차 이름 검증
- [ ] Game : Car list를 입력받음
   - [ ] 각 Car에 대하여 RandomNumberGame을 실행한다.
- [ ] GameResult
   - [ ] 게임 하나를 마치고 결과를 취합
   - [ ] 모든 게임을 마치고 우승자 판별
- [ ] Controller
   - [ ] Car 객체 list를 생성
   - [ ] 시도할 횟수만큼 Game 반복 실행, 게임 하나가 끝날 때마다 출력 View 호출
   - [ ] 모든 게임이 끝난 후 GameResult를 호출, 모든 게임이 끝난 후 출력 View 호출









