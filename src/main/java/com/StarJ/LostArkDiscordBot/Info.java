package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public enum Info {
    // 가디언

    // 군단장
    발탄("부활한 마수의 심장") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }

        @Override
        public StringSelectMenu getMenu() {
            return null;
        }
    }, 비아키스("목마른 쾌락의 정원") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }

        @Override
        public StringSelectMenu getMenu() {
            return null;
        }
    }, 쿠크세이튼("한방중의 서커스") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }

        @Override
        public StringSelectMenu getMenu() {
            return null;
        }
    }, 아브렐슈드("몽환의 아스텔지어") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }

        @Override
        public StringSelectMenu getMenu() {
            return null;
        }
    }, 일리아칸("부패한 군주의 판데모니움") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }

        @Override
        public StringSelectMenu getMenu() {
            return null;
        }
    }, 카멘("어둠의 바라트론") {
        @Override
        public MessageEmbed[] getEmbeds() {
            MessageEmbed embed1 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("노말 1관문 기도하는 자, 킬리네사") //
                    .setImage("https://i.imgur.com/mlnLy87.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ", false)//
                    .addField("145줄 촉수 패턴", "번호x3, 번호x3+1 자리에서 촉수에 파폭 후 무력\nㅤ", false) //
                    .addField("100줄 권능 패턴", "카운터치고 구덩이 2번 넣기\n- 구덩이 실패시 히든 바훈\n\nㅤ", false) //
                    .addField("55줄 촉수 패턴", "145줄 패턴 반복\nㅤ", false) //
                    .addField("50줄 눈깔 패턴", "숭고한 결심 버프시 광폭화시간 1분 연장 가능 및 공대원 10% 딜증가 가능\nㅤ", false) //
                    .addField("35줄 킬리네사의 눈", "클로 상태 3번의 패턴 후 안전지대 제외 광역피해\nㅤ", false) //
                    .addField("에스더(실리안, 웨이, 바훈투르)", "144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르\n\nㅤ", false)//
                    .addField("중요 기믹", "- 유기체 활성화시 스택당 공격력(4%~100%), 공이속 증가 및 상/피면, 출혈 면역\n- 어그로패턴 공대원이 시야를 가려주면 데미지감소 제거\nㅤ", false)//
                    .build(); //
            MessageEmbed embed2 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("노말 2관문 어둠의 기사, 발리나크") //
                    .setImage("https://i.imgur.com/4cJTRnb.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 시정 or 아드\n서폿) 물약 암수 성부 시정 or 각물\nㅤ", false)//
                    .addField("135줄 7카+막카 후 달리기 패턴", "7카+막카, 막카 반격 주의\nㅤ", false) //
                    .addField("72줄 구슬 넣기 패턴", "다른 색깔 구슬 넣기, 어글자 구슬 맞추기 조심\nㅤ", false) //
                    .addField("50줄 전기벽 패턴", "전기벽 뒤로 숨기, 바닥에 에어본 장판 조심\nㅤ", false) //
                    .addField("18줄 쫄몹 타임어택 패턴", "2번째 쫄몹 때 기절 번개 주의\n- 3번쨰 쫄몹은 돌진 유도한 후 에스더 실리안\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 이난나)", "135줄 보스 중간 상태 히든 아제나 사용\n18줄 큰쫄몹 실리안\nㅤ", false)//
                    .addField("중요 기믹", "받피증 디버프\n- 받피증+낙뢰 = 큰데미지 검은 구체\n- 2페이지 똥이 일정 이상 쌓이면 전멸\n- 똥이 2개 겹치면 큰똥 주의\nㅤ", false)//
                    .build(); //
            MessageEmbed embed3 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("노말 3관문 빛을 꺼트리는 자, 카멘") //
                    .setImage("https://i.imgur.com/4Zjawom.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ", false)//
                    .addField("300줄 칼 무력 패턴", "멀리 있는 카멘이 손든쪽 안전\nㅤ", false) //
                    .addField("275줄 알비온 패턴", "카멘 워킹, 검은 안개 스페로 넘어가기\n- ABBB, AABB, 따라라 중중, 따라라 제자리 총 4종류\nㅤ", false) //
                    .addField("255줄 칼 소환 패턴", "어그로 확인후 딜\n- 패턴 3번 후 카운터 후 무력, 단, 2번연속은 무력 불가\n- 칼 잡은 후 강화패턴 시작\nㅤ", false) //
                    .addField("225줄 안전지대 찾기 패턴(별칭 : 실리안)", "검은 안개 스페로 피하고 안전지대를 찾아서기, 부동산 사기 주의!!\nㅤ", false) //
                    .addField("210줄 말타기 후 격돌 패턴", "앞에 검기 주의\n헤드에서 G키를 누르면 1격 시작(4키 q q)\nㅤ", false) //
                    .addField("쉴드제거 패턴", "쉴드(36줄) 깍기\n1격 후 이난나로 딜타임 후 헤드에서 2격 시작(4키 q q)\n- 이후 낙사가 활성화 됨\nㅤ", false) //
                    .addField("1지파 패턴", "3격 시작(4키 4키)\nㅤ", false) //
                    .addField("2지파 패턴", "지파 유기\n 이때부터 카멘 일반패턴\nㅤ", false) //
                    .addField("3지파 패턴", "다시 격돌(4키 4키)을 잡으며 프리딜 타임\n- 딜이 강한 파티는 이때 히나브를 사용\nㅤ", false) //
                    .addField("4지파 패턴", "히든 니나브로 격돌 및 지형파괴를 저지하면서 프리딜 타임\nㅤ", false) //
                    .addField("5지파 패턴", "2지파와 동일하게 유기\nㅤ", false) //
                    .addField("6지파 패턴", "마지막 격돌 위치는 카멘의 앞\nㅤ", false) //
                    .addField("7지파 패턴", "레이드 실패\nㅤ", false) //
                    .addField("90줄 지하 이동 패턴", "외부 암흑 장판 더이상 낙사 없음 55줄까지 타임어택\n- 지금부터 계속 강화패턴\nㅤ", false) //
                    .addField("55줄 반전 패턴", "아자패턴 후 마우스 반전상태로 안전지대 찾기\n그후 내부에서 자신의 분신을 잡기\nㅤ", false) //
                    .addField("35줄 마지막 격돌 패턴", "9시에 모여 왼쪽 바라보고 마지막 격돌(Q Q Q)\n- 마지막 격돌 위치는 카멘의 등\nㅤ", false) //
                    .addField("에스더(니나브, 웨이, 이난나)", "사용한 에스더 재사용 불가\n니나브는 히든, 이난나는 말멘때 사용, 웨이는 지하 이후 마지막에 데미지용\nㅤ", false)//
                    .addField("중요 기믹", "치명상 : 2분동안 받피증\n- 아트록스(빨멘) : 카멘 날개위치가 안전위치며 일반상태에는 제자리 강화상태에는 찍은곳 안전\n- 돌돌이(빨멘) : 주변을 돌돌 하는 검기가 나오는 패턴으로 일반 상태에는 카멘 기준으로 중간 도넛이 안전, 강화 상태는 카멘 기준 수직이 안전\n- 딱붙어(빨멘) : 카멘 등에 딱 붙으면 안전한 패턴으로 프리딜타임으로도 사용가능, 일반 상태시 카멘 뒤 및 오른쪽 안전, 강화 상태시 카멘 등뒤 안전\nㅤ", false)//
                    .build(); //

            MessageEmbed embed4 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("하드 1관문 칠흑의 숭배자, 킬리네사") //
                    .setImage("https://i.imgur.com/E6oBSIA.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ", false)//
                    .addField("145줄 촉수 패턴", "번호x3, 번호x3+1 자리에서 촉수에 파폭 후 무력\nㅤ", false) //
                    .addField("100줄 권능 패턴", "카운터치고 구덩이 2번 넣기\n- 구덩이 실패시 히든 바훈\n\nㅤ", false) //
                    .addField("55줄 강화 촉수 패턴", "산딸기 파괴 주의\n- 파괴시 지속시간동안 무력 불가, 2중첩시 큰 피해\nㅤ", false) //
                    .addField("50줄 눈깔 패턴", "숭고한 결심 버프시 광폭화시간 1분 연장 가능 및 공대원 10% 딜증가 가능\nㅤ", false) //
                    .addField("35줄 킬리네사의 눈", "클로 상태 3번의 패턴 후 안전지대 제외 광역피해\nㅤ", false) //
                    .addField("35줄 블랙홀 눈카)", "가운데 눈 닫을때까지 강화 문어 패턴\n돌진-돌진-촉수 혹은 돌진-촉수-촉수\nㅤ", false) //
                    .addField("에스더(실리안, 웨이, 바훈투르)", "144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르를 통하여 기믹 파훼 진행 가능\n\nㅤ", false)//
                    .addField("중요 기믹", "- 유기체 활성화시 스택당 공격력(4%~100%), 공이속 증가 및 상/피면, 출혈 면역\n- 어그로패턴 공대원이 시야를 가려주면 데미지감소 제거\nㅤ", false)//
                    .build(); //
            MessageEmbed embed5 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("하드 2관문 금기를 삼킨 자, 발리나크") //
                    .setImage("https://i.imgur.com/BUgbNmN.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 시정 or 아드\n서폿) 물약 암수 성부 시정 or 각물\nㅤ", false)//
                    .addField("153줄 지형파괴 패턴", "위/아래 지형 파괴, 낙사판정 추가\n- 주변에서 디버프 브레스를 발사하는 짧은용이 등장\n- 낙사 반대쪽에서부터 시작하여 낙사를 유도하는 해일 패턴 추가\nㅤ", false) //
                    .addField("135줄 7카+막카 후 달리기 패턴", "7카+막카, 막카 반격 주의\nㅤ", false) //
                    .addField("72줄 구슬 넣기 패턴", "다른 색깔 구슬 넣기, 어글자 구슬 맞추기 조심\nㅤ", false) //
                    .addField("50줄 전기벽 패턴", "전기벽 뒤로 숨기, 바닥에 에어본 장판 조심\nㅤ", false) //
                    .addField("18줄 쫄몹 타임어택 패턴", "2번째 쫄몹 때 기절 번개 주의\n- 3번쨰 쫄몹은 돌진 유도한 후 에스더 실리안\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 이난나)", "135줄 보스 중간 상태 히든 아제나 사용\n18줄 큰쫄몹 실리안\nㅤ", false)//
                    .addField("중요 기믹", "받피증 디버프\n- 받피증+낙뢰 = 큰데미지 검은 구체\n- 2페이지 똥이 일정 이상 쌓이면 전멸\n- 똥이 2개 겹치면 큰똥 주의\nㅤ", false)//
                    .build(); //
            MessageEmbed embed6 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("하드 3관문 빛을 꺼트리는 자, 카멘") //
                    .setImage("https://i.imgur.com/TcZGfWG.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ", false)//
                    .addField("300줄 칼 무력 패턴", "멀리 있는 카멘이 손든쪽 안전\nㅤ", false) //
                    .addField("275줄 알비온 패턴", "검은씨앗 폭발 추가, 검은 안개 스페로 넘어가기\n- ABBB, AABB, 따라라 중중, 따라라 제자리 총 4종류\nㅤ", false) //
                    .addField("255줄 칼 소환 패턴", "어그로 확인후 딜\n- 패턴 3번 후 카운터 후 무력, 단, 2번연속은 무력 불가\n- 칼 잡은 후 강화패턴 시작\nㅤ", false) //
                    .addField("225줄 안전지대 찾기 패턴(별칭 : 실리안)", "검은씨앗 폭발 추가, 검은 안개 스페로 피하고 안전지대를 찾아서기, 부동산 사기 주의!!\nㅤ", false) //
                    .addField("210줄 말타기 후 격돌 패턴", "앞에 검기 주의\n헤드에서 G키를 누르면 1격 시작(4키 q q)\nㅤ", false) //
                    .addField("쉴드제거 패턴", "쉴드(40.5줄) 깍기\n1격 후 이난나로 딜타임 후 헤드에서 2격 시작(4키 q q)\n- 이후 낙사가 활성화 됨\nㅤ", false) //
                    .addField("1지파 패턴", "3격 시작(4키 4키)\nㅤ", false) //
                    .addField("2지파 패턴", "지파 유기\n 이때부터 카멘 일반패턴\nㅤ", false) //
                    .addField("3지파 패턴", "다시 격돌(4키 4키)을 잡으며 프리딜 타임\n- 딜이 강한 파티는 이때 히나브를 사용\nㅤ", false) //
                    .addField("4지파 패턴", "히든 니나브로 격돌 및 지형파괴를 저지하면서 프리딜 타임\nㅤ", false) //
                    .addField("5지파 패턴", "2지파와 동일하게 유기\nㅤ", false) //
                    .addField("6지파 패턴", "마지막 격돌 위치는 카멘의 앞\nㅤ", false) //
                    .addField("7지파 패턴", "레이드 실패\nㅤ", false) //
                    .addField("90줄 지하 이동 패턴", "외부 암흑 장판 더이상 낙사 없음 55줄까지 타임어택\n- 지금부터 계속 강화패턴\nㅤ", false) //
                    .addField("55줄 반전 패턴", "검은씨앗 폭발 추가, 아자패턴 후 마우스 반전상태로 안전지대 찾기\n그후 내부에서 자신의 분신을 잡기\nㅤ", false) //
                    .addField("35줄 마지막 격돌 패턴", "9시에 모여 왼쪽 바라보고 마지막 격돌(Q Q Q)\n- 마지막 격돌 위치는 카멘의 등\nㅤ", false) //
                    .addField("에스더(니나브, 웨이, 이난나)", "사용한 에스더 재사용 불가\n니나브는 히든, 이난나는 말멘때 사용, 웨이는 지하 이후 마지막에 데미지용\nㅤ", false)//
                    .addField("중요 기믹", "치명상 : 2분동안 받피증\n- 아트록스(빨멘) : 카멘 날개위치가 안전위치며 일반상태에는 제자리 강화상태에는 찍은곳 안전\n- 돌돌이(빨멘) : 주변을 돌돌 하는 검기가 나오는 패턴으로 일반 상태에는 카멘 기준으로 중간 도넛이 안전, 강화 상태는 카멘 기준 수직이 안전\n- 딱붙어(빨멘) : 카멘 등에 딱 붙으면 안전한 패턴으로 프리딜타임으로도 사용가능, 일반 상태시 카멘 뒤 및 오른쪽 안전, 강화 상태시 카멘 등뒤 안전\nㅤ", false)//
                    .build(); //
            MessageEmbed embed7 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("하드 4-1관문 종말의 시(時), 카멘") //
                    .setImage("https://i.imgur.com/pfvwEgE.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수(내부)/회수(외부) 빛성부 아드\n서폿) 물약 암수 빛성부 각물\nㅤ", false)//
                    .addField("315줄 검 무력 패턴", "검기로 검 무력, 다른 자리 지원 생각\n- 카멘 공포를 스페로 무시한 후 협카\nㅤ", false) //
                    .addField("280줄 내부/외부 패턴", "12시에 대기, 협카후 내부 2인조 진입\n외부 10시 대기 후 장막을 피해서 진입하여 무력\n- 낙사 구간 시작\n- 카멘 착지시 실리안\nㅤ", false) //
                    .addField("175줄 테런 격돌 패턴", "12시 고정 인원 제외 나머지 알잘딱 王자 만들기\n레이저가 꺼진 후 구슬 한개씩 먹고 6시로 이동\n날라오는 검을 피해 카멘에게 도달하여 격돌(q qq qqq)\n1격 5초후 샨디\n1격 후 중앙으로 이동한 카멘에게 2격(4키 4키)\nㅤ", false) //
                    .addField("87줄 검 카운터 패턴", "3시 또는 9시에서 '어둠의 견제' 디버프 활성화시 스페 후 12시로 달리기\n중앙 무력화 후 빨간줄이 뜨면 검을 시계 방향위치로 줄을 막도록 유도하여 카운터\n검 6개 카운터 후 아제나 사용\nㅤ", false) //
                    .addField("63줄 똥 장판 패턴", "1왼 2오로 모여 똥장판을 빼면서 12시 집결 후 다시 원래 자리로 내려가기\n수연이 없는 경우 3번째 똥나오고 빛성부\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 샨디)", "280줄 카단 착지후 실리안, 175줄 1격 5초 후 샨디, 87줄 검 카운터 6개 후 아제나", false)//
                    .addField("중요 기믹", "정산 : 장판을 피한후 중앙에서 수구리/만세 카운터 후 카멘 자세와 동일한 3개의 분신 카운터\n그 이후 모여서 카멘 유도후 협카 후 체력 깍기\n- 검/도끼/검도끼에 맞는 패턴 숙지 필수, 카운터 및 지진 패턴 다수 존재\nㅤ", false)//
                    .build(); //
            MessageEmbed embed8 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("하드 4-2관문 별을 제패한 자, 카멘") //
                    .setImage("https://i.imgur.com/TgmGyKG.png") //
                    .addField("배틀 아이템", "물약 암수/회수 빛성부 시정\nㅤ", false)//
                    .addField("6분 15초 영역 전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ", false) //
                    .addField("정산 패턴", "공격 카단으로 파훼\nㅤ", false) //
                    .addField("210줄 무력화 패턴", "빨간 손 5스택시 사망, 낙사 주의\nㅤ", false) //
                    .addField("2분 50초 영역 전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ", false) //
                    .addField("정산 패턴", "공격 카단으로 파훼\nㅤ", false) //
                    .addField("4분 조우 패턴", "\nㅤ", false) //
                    .addField("3분 대격돌 패턴", "방어 카단으로 파훼\nㅤ", false) //
                    .addField("정산 패턴", "공격 카단으로 파훼\nㅤ", false) //
                    .addField("1분 영역전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ", false) //
                    .addField("1분이하 패턴", "\nㅤ", false) //
                    .addField("에스더(공카단, 방카단)", "\nㅤ", false)//
                    .addField("중요 기믹", "\nㅤ", false)//
                    .build(); //
            return new MessageEmbed[]{embed1, embed2, embed3, embed4, embed5, embed6, embed7,embed8};
        }

        @Override
        public StringSelectMenu getMenu() {
            List<MessageStore.StringSelect> list = new ArrayList<>();
            list.add(new MessageStore.StringSelect("노말 1관문", "0"));
            list.add(new MessageStore.StringSelect("노말 2관문", "1"));
            list.add(new MessageStore.StringSelect("노말 3관문", "2"));
            list.add(new MessageStore.StringSelect("하드 1관문", "3"));
            list.add(new MessageStore.StringSelect("하드 2관문", "4"));
            list.add(new MessageStore.StringSelect("하드 3관문", "5"));
            list.add(new MessageStore.StringSelect("하드 4-1관문", "6"));
            list.add(new MessageStore.StringSelect("하드 4-2관문", "7"));
            return MessageStore.getStringSelectMenu(this.name(), "관문 선택하기", list.toArray(MessageStore.StringSelect[]::new));
        }
    }
    //
    ;
    protected final String description;

    Info(String description) {
        this.description = description;
    }

//    public String getDescription() {
//        return description;
//    }

    public abstract MessageEmbed[] getEmbeds();

    public abstract StringSelectMenu getMenu();

    public static Info[] getCommander() {
        return new Info[]{
                발탄, 비아키스, 쿠크세이튼, 아브렐슈드, 일리아칸, 카멘};
    }
}
