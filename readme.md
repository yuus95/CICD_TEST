# CICD_TEST

- CICD 테스트용도

- Ec2에서는 ./gradle test에서 멈춤 RAM부족 현상 같음

## 배포 
- 작성한 코드를 실제 서버에 반영하는 것을 배포라고 한다.
- 배포할 때마다 개발자가 하나하나 명령어를 실행하는 것은 불편함이 많다.



## EC2 작업하기
```bash
// 시간대 변경
sudo rm /etc/localtime
sudo ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime

//호스트 네임 변경
sudo vim /etc/sysconfig/network
// vi 편집기 접속후        
HOSTNAME=  ??? // 원하는 이름입력
```

## 깃 다운로드
```bash
sudo yum install git 
git --version

//깃폴더 만들기
mkdir git 
git clone 프로젝트
cd 프로젝트


```

## 배포 작업

```
git pull
./gradlew build

// cd build/libs 
java -jar jar파일 실행
```

linux 명령어
- echo 컴퓨터 터미널에 출력하는 명령어