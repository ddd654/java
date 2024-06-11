package _study;

public class Git {
	
	/*
	 * -깃 깃관련 명령문은 앞에 git 붙음
	 * 
	 * 하이픈 - << 한개는 이니셜로, -- 두개는 풀네임적어서 명령
	 * 
	 * -처음 세팅
	 * git config --global user.name ""
	 * git config --global user.email ""
	 * 
	 * -첫 초기화, 한번만
	 * git init
	 *
	 * -자격증명 확인하기
	 * --------------------------------------
	 * 
	 * 쉬프트 + 인설트 하면 분여넣기
	 * cd + 폴더 주소 = 적으면 그폴더로 인식
	 * cd .. = 이전 경로 이동
	 * clear 적으면 창 글 제거 git --version
	   git status
	   git rm -- cached 파일명 > 스테이지에서 지우기 remove
	 * git commit -m 메시지 > 깃을 레포에 저장
	 * 
	 * git reset --hard HEAD^  < 모두 초기화
	 * git reset --mixed HEAD^  < 수정한, 작성한 코드는 남는다
	 * git reset --soft HEAD^  < 커밋만 리셋
	 * ^ 한단계만 초기화한다는 표시
	 *
	 *  
	 * -----------------------------------
	 * 
	 * .gitignore 필요없는 파일 필터링하기
	 * 
	 * git branch ABC : branch 만들기
	 * git branch : branch 확인하기
	 * 
	 * git remote add 단축이름 주소
	 * git push origin branch
	 * git pull
	 * git fetch
	 * git clone
	 * 
	 * 같이 쓸때는 기능 하나당 커밋한번
	 * 같은파일 수정 x
	 * 
	 * -comflict 절차
	 * 원격에서 충돌 파일 수정으로 충돌
	 * 로컬에서 맞는 코드 찾아 수정 후 커밋 및 푸시
	 * 
	 * 
	 * pull request 방식과 collaborate 방식
	 * 
	 * -----------------------------------
	 * 
	 * 
	 * 
	 * 
	 */
}
