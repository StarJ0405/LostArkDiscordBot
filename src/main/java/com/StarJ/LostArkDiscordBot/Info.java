package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public enum Info {
    // https://www.inven.co.kr/board/lostark/4821/95924
    // 가디언

    // 군단장
    발탄(Color.blue, "부활한 마수의 심장", "노말 1관문", "노말 2관문", "하드 1관문", "하드 2관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말/하드 1관 검은 산의 포식자, 루가루", "https://i.imgur.com/UKt1CH0.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 회수 성부 아드\n서폿) 물약 회수 성부 각물\nㅤ") //
                    .add("45줄 보스 변신", "빨간색으로 변경\nㅤ") //
                    .add("40줄 난입", "파란색 난입\nㅤ") //
                    .add("35줄 암흑 디버프", "스택 중첩시 감금\nㅤ") //
                    .add("30줄 구슬 무력", "번호 순서로 구슬 먹고 무력\n- 파란색으로 변경\n웨이로 파훼, 딜쌘파티는 직접\nㅤ") //
                    .add("25줄 난입", "빨간색 난입\nㅤ") //
                    .add("15줄 구슬 무력", "번호 순서로 구슬 먹고 무력\n- 보라색으로 변경\n웨이로 파훼\nㅤ") //
                    .add("15줄 이하 공포 무력", "공포 걸린 인원에게 가서 무력해주기\n공포는 포효 후 가장 멀리있는 유저 대상\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "30,15줄 구슬먹기에 웨이, 15줄 이하 실리안\nㅤ") //
                    .add("중요 기믹", "출혈 : 빨간색 루가루때 쌓이며 3스택시 벏위를 긁는 데미지가 나오므로 주의\n기운 던지기 : 빨/파/초 기운에 따라 기능이 다름\n- 빨강 : 범위 장판, 파랑 : 빙결, 초록 : 순차적으로 터지는 도넛 장판\nㅤ")) //

                    , createMessageEmbed("노말/하드 2관 마수군단장, 발탄", "https://i.imgur.com/Chs8HgC.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 파괴 아드/시정\n서폿) 물약 부식 각물/시정\nㅤ") //
                    .add("145줄 갑옷 파괴", "3-1-11-9형태로 파괴\n파괴가 빠르면 3-1-9로 충분\nㅤ") //
                    .add("132줄 전멸기", "바훈투르로 파훼\n로나운의 기운으로도 파훼 가능, 1인당 1기운 필요\nㅤ") //
                    .add("110줄 임포스터", "타겟 부채꼴 범위 후 맵 전체 피해\n타겟 부채꼴 즉사(시정 포함), 범위피해는 돌뒤에서 회피 가능\nㅤ") //
                    .add("88줄 1지파", "맵 왼쪽/오른쪽 지형 중 하나 파괴\nㅤ") //
                    .add("65줄 버러지", "장판 후 매우 빠른 카운터\nㅤ") //
                    .add("30줄 2지파", "남은 지형 파괴\nㅤ") //
                    .add("16줄 연환파신권", "어글 대상 기준으로 좌우상하 피해 후 바닥찍으며 플레이어 바닥에 똥 발생\n그 후 돌이 생기며 충격파 피해\nㅤ") //
                    .add("40줄이하 유령", "5가지 랜덤 2번 후 휘적휘적/반격\n- 휘적휘적, 잡기, 반격 제외 패턴시 분신 외곽 생성\nㅤ") //
                    .add("39.5줄", "잡기 후 뒤로 돌려 포효\nㅤ")//
                    .add("26줄", "잡기 후 뒤로 돌려 포효\nㅤ")//
                    .add("13줄", "잡기 후 뒤로 돌려 포효\nㅤ")//
                    .add("에스더(실리안, 웨이, 바훈투르)", "132줄 바훈투르, 16줄 연환파신권(딜약한경우), 유령패턴 실리안\nㅤ") //
                    .add("중요 기믹", "3연카 : 3번 연속 카운터해야하며 실패시 큰피해, 마지막 카운터 실패시 전멸\n반격 : 도끼자루 제외 피해를 입으며, 반격 발동시 범위 피해(지파 이후 낙사 유발)\n원혼불 : 4곳에 원혼불 발생하며 먹지 않으면 파티원 전체 디버프\n보호막+원혼 충전 강타 : 보호막 후 무력, 실패시 큰 피해\nㅤ")) //
            };
        }

    }, 비아키스(Color.blue, "목마른 쾌락의 정원", "노말 1관문", "노말 2관문", "하드 1관문", "하드 2관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말/하드 1관 욕망의 탐식자, 비아키스", "https://i.imgur.com/UWBaEaR.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 화수 아드/시정\n서폿) 물약 화수 각물/시정\nㅤ") //
                    .add("144줄 데칼", "빙빙돌기\nㅤ") //
                    .add("120줄 보접빨핀", "중앙 5명 보라색/빨간색 구별, 3명 3-7-11시 날개 브리핑\n보라 : 접-반-핀, 빨강 : 핀-반-접\nㅤ") //
                    .add("102줄 데칼", "빙빙돌기\nㅤ") //
                    .add("80줄 와플", "안전지대 찾기, 가운데 회전문 조심\nㅤ") //
                    .add("65줄 검빨구슬", "검은색 파장 순서에 맞춰서 구슬 먹기 2회시 사망\n시정으로 검은색 2개이상 먹을 수 있으나 빨간색 먹을시 즉시 사망\nㅤ") //
                    .add("50줄 이하", "3 피격시 욕망 주입\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "각 나올때마다 니나브\nㅤ") //
                    .add("중요 기믹", "보라링 : 타켓을 향해 다가가며 일정 시간 혹은 먹으면 그외 장판으로 광범위로 터짐\n욕망 주입 : 투사체를 발사시키는 똥(하드 기절, 노말 경직)\n욕망 주입-폭발 : 무력화 혹은 랜덤패턴으로 폭발\nㅤ")) //

                    , createMessageEmbed("노말 2관 욕망군단장, 비아키스", "https://i.imgur.com/cMyjzsH.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ") //
                    .add("170줄 늪", "신속의 욕망은 바깥쪽에 절망의 늪은 연달아 깔기\nㅤ") //
                    .add("152줄 석상", "석상과 검이 겹치는 곳 찾기\n매혹게이지 70%이상인 사람만 검 볼 수 있음 = 검핑\nㅤ") //
                    .add("135줄 아재", "아재 패턴, 실패시 피해(4인이상 전멸)\n- 12시모여 구슬까기(게이지 비례 패턴 난이도 증가)\nㅤ") //
                    .add("120줄 왕좌", "일부로 매혹에 빠지기, 실패시 사망\nㅤ") //
                    .add("102줄 무력", "무력화 후 시정 혹은 무력화 및 거대 몬스터 중 한마리 잡고 그쪽으로 이동\n- 3시 구슬까기(무력화 중 게이지 증가)\nㅤ") //
                    .add("75줄 늪", "170줄과 동일\nㅤ") //
                    .add("55줄 촉수", "욕망 게이지 70%이상 유지하면서 촉수 6개 잡기\n- 70%미만시 촉수에 데미지 0\nㅤ") //
                    .add("2줄 이하 무력", "노란 구슬 까고(6시 or 9시) 진짜 비아키스 찾아가서 무력화(반복)\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "130줄 공습 후 니나브(딜약한 파티), 0줄 무력화 웨이\nㅤ") //
                    .add("중요 기믹", "욕망 게이지 70% 이상시 공격력 및 받는 피해 증가(최대 40%)\nㅤ")) //

                    , createMessageEmbed("하드 2관 욕망의 화신, 비아키스", "https://i.imgur.com/kV4JDqR.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 파폭 아드\n서폿) 물약 암/회수 파폭 각물\nㅤ") //
                    .add("170줄 늪", "신속의 욕망은 바깥쪽에 절망의 늪은 연달아 깔기\nㅤ") //
                    .add("152줄 석상", "석상과 검이 겹치는 곳 찾기\n매혹게이지 70%이상인 사람만 검 볼 수 있음 = 검핑\nㅤ") //
                    .add("135줄 아재", "아재 패턴, 실패시 피해(4인이상 전멸)\n- 12시모여 구슬까기(게이지 비례 패턴 난이도 증가)\nㅤ") //
                    .add("120줄 왕좌", "일부로 매혹에 빠지기, 실패시 사망\nㅤ") //
                    .add("102줄 무력", "무력화 후 시정 혹은 무력화 및 거대 몬스터 중 한마리 잡고 그쪽으로 이동\n- 3시 구슬까기(무력화 중 게이지 증가)\nㅤ") //
                    .add("75줄 늪", "170줄과 동일\nㅤ") //
                    .add("55줄 촉수", "욕망 게이지 70%이상 유지하면서 촉수 8개 잡기\n- 70%미만시 촉수에 데미지 0\nㅤ") //
                    .add("30줄 연타", "구슬 먹고 연타하기\nㅤ") //
                    .add("2줄 이하 무력", "9시 구슬 까고 진짜 비아키스 찾아가서 무력화(반복)\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "130줄 공습 후 니나브(딜약한 파티), 0줄 무력화 웨이\nㅤ") //
                    .add("중요 기믹", "욕망 게이지 70% 이상시 공격력 및 받는 피해 증가(최대 40%)\nㅤ")) //
            };
        }

    }, 쿠크세이튼(Color.blue, "한방중의 서커스", "노말 1관문", "노말 2관문", "노말 3관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말 1관 ", "https://i.imgur.com/CMBSr6K.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 성부 아드\n서폿) 물약 암/회수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "니나브 또는 웨이(반격 무력약할때), 간혹 인원 사망시 \nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 2관 ", "https://i.imgur.com/2SyChsP.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드/시정\n서폿) 물약 암수 성부 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 3관 ", "https://i.imgur.com/c4Mamwj.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 회수 성부 아드\n서폿) 물약 회수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }

    }, 아브렐슈드(Color.blue, "몽환의 아스텔지어", "노말 1관문", "노말 2관문", "노말 3관문", "노말 4관문", "하드 1관문", "하드 2관문", "하드 3관문", "하드 4관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말 1관 ", "https://i.imgur.com/YK7wLNb.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 아드\n서폿) 물약 암수 각물\n2파티 한팀 cc기 혹은 cc기폭탄 권장\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 2관 ", "https://i.imgur.com/eTC1jvM.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 시정\n서폿) 물약 암수 성부 시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 3관 ", "https://i.imgur.com/NthEbdu.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/화수 성부 아드/시정\n서폿) 물약 암/화수 성부 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 4관 ", "https://i.imgur.com/b3LLNmz.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 아드/시정\n서폿) 물약 암/회수 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 1관 ", "https://i.imgur.com/71uuJ8L.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 아드\n서폿) 물약 암수 각물\n2파티 한팀 cc기 혹은 cc기폭탄 권장\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 2관 ", "https://i.imgur.com/kQbHzpR.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 시정\n서폿) 물약 암수 성부 시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 3관 ", "https://i.imgur.com/NthEbdu.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/화수 성부 아드/시정\n서폿) 물약 암/화수 성부 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 4관 ", "https://i.imgur.com/GS9D8Ej.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 아드/시정\n서폿) 물약 암/회수 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }
    },
    카양겔(Color.CYAN, "영원한 빛의 요람", "노말/하드 1관", "노말/하드 2관", "노말/하드 3관") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말/하드 1관 ", "https://i.imgur.com/W90oxcv.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말/하드 2관 ", "https://i.imgur.com/Cw9LsSg.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말/하드 3관 ", "https://i.imgur.com/ZFPQdtx.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/화수 아드/시정\n서폿) 물약 암/화수 각물/시정\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }
    }, 일리아칸(Color.blue, "부패한 군주의 판데모니움", "노말 1관문", "노말 2관문", "노말 3관문", "하드 1관문", "하드 2관문", "하드 3관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말 1관 ", "https://i.imgur.com/FJ9Qsy7.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 성부 아드\n서폿) 물약 암/회수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 2관 ", "https://i.imgur.com/GB2sSOU.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 파폭 성부 아드\n서폿) 물약 부식 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말 3관 ", "https://i.imgur.com/RLZra7E.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 1관 ", "https://i.imgur.com/cYCer8m.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 성부 아드\n서폿) 물약 암/회수 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 2관 ", "https://i.imgur.com/Huryz1E.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 파폭 성부 아드\n서폿) 물약 부식 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("하드 3관 ", "https://i.imgur.com/PkI9xE3.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 파폭 성부 아드\n서폿) 물약 파폭/부식 성부 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }
    },
    혼돈의_상아탑(Color.CYAN, "짓밟힌 정원", "노말/하드 1관", "노말/하드 2관", "노말/하드 3관", "노말/하드 4관") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말/하드 1관 ", "https://i.imgur.com/966HLgT.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 아드\n서폿) 물약 암수 각물\n- 1명 화수 또는 화속성 스킬 필수\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말/하드 2관 ", "https://i.imgur.com/nhVd3M8.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 파괴 아드\n서폿) 물약 암/회수 파괴 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말/하드 3관 ", "https://i.imgur.com/2HTGyS0.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 파괴 아드\n서폿) 물약 암/회수 파괴 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
                    , createMessageEmbed("노말/하드 4관 ", "https://i.imgur.com/22Zcs5B.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 파괴 아드\n서폿) 물약 암/회수 파괴 각물\nㅤ") //
                    .add("", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }
    }, 카멘(Color.blue, "어둠의 바라트론", "노말 1관문", "노말 2관문", "노말 3관문", "하드 1관문", "하드 2관문", "하드 3관문", "하드 4-1관문", "하드 4-2관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말 1관문 기도하는 자, 킬리네사", "https://i.imgur.com/mlnLy87.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ") //
                    .add("145줄 촉수 패턴", "번호x3, 번호x3+1 자리에서 촉수에 파폭 후 무력\nㅤ") //
                    .add("100줄 권능 패턴", "카운터치고 구덩이 2번 넣기\n- 구덩이 실패시 히든 바훈\nㅤ") //
                    .add("55줄 촉수 패턴", "145줄 패턴 반복\nㅤ") //
                    .add("50줄 눈깔 패턴", "숭고한 결심 버프시 광폭화시간 1분 연장 가능 및 공대원 10% 딜증가 가능\nㅤ") //
                    .add("35줄 킬리네사의 눈", "클로 상태 3번의 패턴 후 안전지대 제외 광역피해\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르\nㅤ") //
                    .add("중요 기믹", "- 유기체 활성화시 스택당 공격력(4%~100%), 공이속 증가 및 상/피면, 출혈 면역\n- 어그로패턴 공대원이 시야를 가려주면 데미지감소 제거\nㅤ")) //

                    , createMessageEmbed("노말 2관문 어둠의 기사, 발리나크", "https://i.imgur.com/4cJTRnb.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 시정/아드\n서폿) 물약 암수 성부 시정/각물\nㅤ") //
                    .add("135줄 7카+막카 후 달리기 패턴", "7카+막카, 막카 반격 주의\nㅤ") //
                    .add("72줄 구슬 넣기 패턴", "다른 색깔 구슬 넣기, 어글자 구슬 맞추기 조심\nㅤ") //
                    .add("50줄 전기벽 패턴", "전기벽 뒤로 숨기, 바닥에 에어본 장판 조심\nㅤ") //
                    .add("18줄 쫄몹 타임어택 패턴", "2번째 쫄몹 때 기절 번개 주의\n- 3번쨰 쫄몹은 돌진 유도한 후 에스더 실리안\nㅤ") //
                    .add("에스더(실리안, 아제나, 이난나)", "135줄 보스 중간 상태 히든 아제나 사용\n18줄 큰쫄몹 실리안\nㅤ") //
                    .add("중요 기믹", "받피증 디버프\n- 받피증+낙뢰 = 큰데미지 검은 구체\n- 2페이지 똥이 일정 이상 쌓이면 전멸\n- 똥이 2개 겹치면 큰똥 주의\nㅤ")) //

                    , createMessageEmbed("노말 3관문 빛을 꺼트리는 자, 카멘", "https://i.imgur.com/4Zjawom.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ") //
                    .add("300줄 칼 무력 패턴", "멀리 있는 카멘이 손든쪽 안전\nㅤ") //
                    .add("275줄 알비온 패턴", "카멘 워킹, 검은 안개 스페로 넘어가기\n- ABBB, AABB, 따라라 중중, 따라라 제자리 총 4종류\nㅤ") //
                    .add("255줄 칼 소환 패턴", "어그로 확인후 딜\n- 패턴 3번 후 카운터 후 무력, 단, 2번연속은 무력 불가\n- 칼 잡은 후 강화패턴 시작\nㅤ") //
                    .add("225줄 안전지대 찾기 패턴(별칭 : 실리안)", "검은 안개 스페로 피하고 안전지대를 찾아서기, 부동산 사기 주의!!\nㅤ") //
                    .add("210줄 말타기 후 격돌 패턴", "앞에 검기 주의\n헤드에서 G키를 누르면 1격 시작(4키 q q)\nㅤ") //
                    .add("쉴드제거 패턴", "쉴드(36줄) 깍기\n1격 후 이난나로 딜타임 후 헤드에서 2격 시작(4키 q q)\n- 이후 낙사가 활성화 됨\nㅤ") //
                    .add("1지파 패턴", "3격 시작(4키 4키)\nㅤ") //
                    .add("2지파 패턴", "지파 유기\n 이때부터 카멘 일반패턴\nㅤ") //
                    .add("3지파 패턴", "다시 격돌(4키 4키)을 잡으며 프리딜 타임\n- 딜이 강한 파티는 이때 히나브를 사용\nㅤ") //
                    .add("4지파 패턴", "히든 니나브로 격돌 및 지형파괴를 저지하면서 프리딜 타임\nㅤ") //
                    .add("5지파 패턴", "2지파와 동일하게 유기\nㅤ") //
                    .add("6지파 패턴", "마지막 격돌 위치는 카멘의 앞\nㅤ") //
                    .add("7지파 패턴", "레이드 실패\nㅤ") //
                    .add("90줄 지하 이동 패턴", "외부 암흑 장판 더이상 낙사 없음 55줄까지 타임어택\n- 지금부터 계속 강화패턴\nㅤ") //
                    .add("55줄 반전 패턴", "아자패턴 후 마우스 반전상태로 안전지대 찾기\n그후 내부에서 자신의 분신을 잡기\nㅤ") //
                    .add("35줄 마지막 격돌 패턴", "9시에 모여 왼쪽 바라보고 마지막 격돌(Q Q Q)\n- 마지막 격돌 위치는 카멘의 등\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "사용한 에스더 재사용 불가\n니나브는 히든, 이난나는 말멘때 사용, 웨이는 지하 이후 마지막에 데미지용\nㅤ") //
                    .add("중요 기믹", "치명상 : 2분동안 받피증\n- 아트록스(빨멘) : 카멘 날개위치가 안전위치며 일반상태에는 제자리 강화상태에는 찍은곳 안전\n- 돌돌이(빨멘) : 주변을 돌돌 하는 검기가 나오는 패턴으로 일반 상태에는 카멘 기준으로 중간 도넛이 안전, 강화 상태는 카멘 기준 수직이 안전\n- 딱붙어(빨멘) : 카멘 등에 딱 붙으면 안전한 패턴으로 프리딜타임으로도 사용가능, 일반 상태시 카멘 뒤 및 오른쪽 안전, 강화 상태시 카멘 등뒤 안전\nㅤ")) //

                    , createMessageEmbed("하드 1관문 칠흑의 숭배자, 킬리네사", "https://i.imgur.com/E6oBSIA.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ") //
                    .add("145줄 촉수 패턴", "번호x3, 번호x3+1 자리에서 촉수에 파폭 후 무력\nㅤ") //
                    .add("100줄 권능 패턴", "카운터치고 구덩이 2번 넣기\n- 구덩이 실패시 히든 바훈\nㅤ") //
                    .add("55줄 강화 촉수 패턴", "산딸기 파괴 주의\n- 파괴시 지속시간동안 무력 불가, 2중첩시 큰 피해\nㅤ") //
                    .add("50줄 눈깔 패턴", "숭고한 결심 버프시 광폭화시간 1분 연장 가능 및 공대원 10% 딜증가 가능\nㅤ") //
                    .add("35줄 킬리네사의 눈", "클로 상태 3번의 패턴 후 안전지대 제외 광역피해\nㅤ") //
                    .add("35줄 블랙홀 눈카)", "가운데 눈 닫을때까지 강화 문어 패턴\n돌진-돌진-촉수 혹은 돌진-촉수-촉수\nㅤ") //
                    .add("에스더(실리안, 웨이, 바훈투르)", "144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르를 통하여 기믹 파훼 진행 가능\nㅤ") //
                    .add("중요 기믹", "- 유기체 활성화시 스택당 공격력(4%~100%), 공이속 증가 및 상/피면, 출혈 면역\n- 어그로패턴 공대원이 시야를 가려주면 데미지감소 제거\nㅤ")) //

                    , createMessageEmbed("하드 2관문 금기를 삼킨 자, 발리나크", "https://i.imgur.com/oRxgVKS.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 시정 or 아드\n서폿) 물약 암수 성부 시정 or 각물\nㅤ") //
                    .add("153줄 지형파괴 패턴", "위/아래 지형 파괴, 낙사판정 추가\n- 주변에서 디버프 브레스를 발사하는 짧은용이 등장\n- 낙사 반대쪽에서부터 시작하여 낙사를 유도하는 해일 패턴 추가\nㅤ") //
                    .add("135줄 7카+막카 후 달리기 패턴", "7카+막카, 막카 반격 주의\nㅤ") //
                    .add("72줄 구슬 넣기 패턴", "다른 색깔 구슬 넣기, 어글자 구슬 맞추기 조심\nㅤ") //
                    .add("50줄 전기벽 패턴", "전기벽 뒤로 숨기, 바닥에 에어본 장판 조심\nㅤ") //
                    .add("18줄 쫄몹 타임어택 패턴", "2번째 쫄몹 때 기절 번개 주의\n- 3번쨰 쫄몹은 돌진 유도한 후 에스더 실리안\nㅤ") //
                    .add("에스더(실리안, 아제나, 이난나)", "135줄 보스 중간 상태 히든 아제나 사용\n18줄 큰쫄몹 실리안\nㅤ") //
                    .add("중요 기믹", "받피증 디버프\n- 받피증+낙뢰 = 큰데미지 검은 구체\n- 2페이지 똥이 일정 이상 쌓이면 전멸\n- 똥이 2개 겹치면 큰똥 주의\nㅤ")) //

                    , createMessageEmbed("하드 3관문 빛을 꺼트리는 자, 카멘", "https://i.imgur.com/TcZGfWG.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 성부 각물\nㅤ") //
                    .add("300줄 칼 무력 패턴", "멀리 있는 카멘이 손든쪽 안전\nㅤ") //
                    .add("275줄 알비온 패턴", "검은씨앗 폭발 추가, 검은 안개 스페로 넘어가기\n- ABBB, AABB, 따라라 중중, 따라라 제자리 총 4종류\nㅤ") //
                    .add("255줄 칼 소환 패턴", "어그로 확인후 딜\n- 패턴 3번 후 카운터 후 무력, 단, 2번연속은 무력 불가\n- 칼 잡은 후 강화패턴 시작\nㅤ") //
                    .add("225줄 안전지대 찾기 패턴(별칭 : 실리안)", "검은씨앗 폭발 추가, 검은 안개 스페로 피하고 안전지대를 찾아서기, 부동산 사기 주의!!\nㅤ") //
                    .add("210줄 말타기 후 격돌 패턴", "앞에 검기 주의\n헤드에서 G키를 누르면 1격 시작(4키 q q)\nㅤ") //
                    .add("쉴드제거 패턴", "쉴드(40.5줄) 깍기\n1격 후 이난나로 딜타임 후 헤드에서 2격 시작(4키 q q)\n- 이후 낙사가 활성화 됨\nㅤ") //
                    .add("1지파 패턴", "3격 시작(4키 4키)\nㅤ") //
                    .add("2지파 패턴", "지파 유기\n 이때부터 카멘 일반패턴\nㅤ") //
                    .add("3지파 패턴", "다시 격돌(4키 4키)을 잡으며 프리딜 타임\n- 딜이 강한 파티는 이때 히나브를 사용\nㅤ") //
                    .add("4지파 패턴", "히든 니나브로 격돌 및 지형파괴를 저지하면서 프리딜 타임\nㅤ") //
                    .add("5지파 패턴", "2지파와 동일하게 유기\nㅤ") //
                    .add("6지파 패턴", "마지막 격돌 위치는 카멘의 앞\nㅤ") //
                    .add("7지파 패턴", "레이드 실패\nㅤ") //
                    .add("90줄 지하 이동 패턴", "외부 암흑 장판 더이상 낙사 없음 55줄까지 타임어택\n- 지금부터 계속 강화패턴\nㅤ") //
                    .add("55줄 반전 패턴", "검은씨앗 폭발 추가, 아자패턴 후 마우스 반전상태로 안전지대 찾기\n그후 내부에서 자신의 분신을 잡기\nㅤ") //
                    .add("35줄 마지막 격돌 패턴", "9시에 모여 왼쪽 바라보고 마지막 격돌(Q Q Q)\n- 마지막 격돌 위치는 카멘의 등\nㅤ") //
                    .add("에스더(니나브, 웨이, 이난나)", "사용한 에스더 재사용 불가\n니나브는 히든, 이난나는 말멘때 사용, 웨이는 지하 이후 마지막에 데미지용\nㅤ") //
                    .add("중요 기믹", "치명상 : 2분동안 받피증\n- 아트록스(빨멘) : 카멘 날개위치가 안전위치며 일반상태에는 제자리 강화상태에는 찍은곳 안전\n- 돌돌이(빨멘) : 주변을 돌돌 하는 검기가 나오는 패턴으로 일반 상태에는 카멘 기준으로 중간 도넛이 안전, 강화 상태는 카멘 기준 수직이 안전\n- 딱붙어(빨멘) : 카멘 등에 딱 붙으면 안전한 패턴으로 프리딜타임으로도 사용가능, 일반 상태시 카멘 뒤 및 오른쪽 안전, 강화 상태시 카멘 등뒤 안전\nㅤ")) //

                    , createMessageEmbed("하드 4-1관문 종말의 시(時), 카멘", "https://i.imgur.com/TjVS1sX.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암수(내부)/회수(외부) 빛성부 아드\n서폿) 물약 암수 빛성부 각물\nㅤ") //
                    .add("315줄 검 무력 패턴", "검기로 검 무력, 다른 자리 지원 생각\n- 카멘 공포를 스페로 무시한 후 협카\nㅤ") //
                    .add("280줄 내부/외부 패턴", "12시에 대기, 협카후 내부 2인조 진입\n외부 10시 대기 후 장막을 피해서 진입하여 무력\n- 낙사 구간 시작\n- 카멘 착지시 실리안\nㅤ") //
                    .add("175줄 테런 격돌 패턴", "12시 고정 인원 제외 나머지 알잘딱 王자 만들기\n레이저가 꺼진 후 구슬 한개씩 먹고 6시로 이동\n날라오는 검을 피해 카멘에게 도달하여 격돌(q qq qqq)\n1격 5초후 샨디\n1격 후 중앙으로 이동한 카멘에게 2격(4키 4키)\nㅤ") //
                    .add("87줄 검 카운터 패턴", "3시 또는 9시에서 '어둠의 견제' 디버프 활성화시 스페 후 12시로 달리기\n중앙 무력화 후 빨간줄이 뜨면 검을 시계 방향위치로 줄을 막도록 유도하여 카운터\n검 6개 카운터 후 아제나 사용\nㅤ") //
                    .add("63줄 똥 장판 패턴", "1왼 2오로 모여 똥장판을 빼면서 12시 집결 후 다시 원래 자리로 내려가기\n수연이 없는 경우 3번째 똥나오고 빛성부\nㅤ") //
                    .add("에스더(실리안, 아제나, 샨디)", "280줄 카단 착지후 실리안, 175줄 1격 5초 후 샨디, 87줄 검 카운터 6개 후 아제나") //
                    .add("중요 기믹", "정산 : 장판을 피한후 중앙에서 수구리/만세 카운터 후 카멘 자세와 동일한 3개의 분신 카운터\n그 이후 모여서 카멘 유도후 협카 후 체력 깍기\n- 검/도끼/검도끼에 맞는 패턴 숙지 필수, 카운터 및 지진 패턴 다수 존재\nㅤ")) //

                    , createMessageEmbed("하드 4-2관문 별을 제패한 자, 카멘", "https://i.imgur.com/TgmGyKG.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "물약 암수/회수 빛성부 시정\nㅤ") //
                    .add("6분 15초 영역 전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ") //
                    .add("정산 패턴", "공격 카단으로 파훼\nㅤ") //
                    .add("210줄 무력화 패턴", "빨간 손 5스택시 사망, 낙사 주의\nㅤ") //
                    .add("2분 50초 영역 전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ") //
                    .add("정산 패턴", "공격 카단으로 파훼\nㅤ") //
                    .add("4분 조우 패턴", "\nㅤ") //
                    .add("3분 대격돌 패턴", "방어 카단으로 파훼\nㅤ") //
                    .add("정산 패턴", "공격 카단으로 파훼\nㅤ") //
                    .add("1분 영역 전개 패턴", "유저 화면에 검기를 랜덤으로 4명에게 검기를 날림, 시정으로 파훼\nㅤ") //
                    .add("1분이하 패턴", "\nㅤ") //
                    .add("에스더(공카단, 방카단)", "\nㅤ") //
                    .add("중요 기믹", "\nㅤ")) //
            };
        }


    }, 에키드나(Color.pink, "서막 : 붉어진 백야의 나선", "노말 1관문", "노말 2관문", "하드 1관문", "하드 2관문") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[]{createMessageEmbed("노말 1관 붉은 재앙, 다르키엘", "https://i.imgur.com/2qkMGO7.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 아드\n서폿) 물약 암/회수 각물\nㅤ") //
                    .add("180줄 쫄 처리 패턴", "처음 용 브레스 주의하고 1왼2오 쫄몹 잡고 무력하기") //
                    .add("162줄 달리기 후 무력 패턴", "달리기 하고 중간에 짤몹 및 네임드 잡고 도착하여 무력") //
                    .add("135줄 알비온 협카 패턴", "다른 색깔 줄 안전지대, 4번째 다르키엘 간곳에 협카") //
                    .add("110줄 3쫄 패턴", "아델을 사용하여 짤몹 잡기") //
                    .add("90줄 내부 파티 이동 패턴", "내부 파티 이동하며 가서 무력 후 딜몰") //
                    .add("내부 62줄 부채 안전지대 패턴", "내부 부채 가로/세로 브리핑, 외부 브리핑에 맞춰 안전지대에서 딜") //
                    .add("내부 50줄 향로 패턴", "내부 쫄잡고 향로색 브리핑, 외부 색 브리핑에 맞춰 향로 파괴\n외부 향로 파괴후 내부는 무력화, 내부 무력화 외부는 쉴드 파괴(반사 주의)") //
                    .add("50줄 광폭화", "좁아진 맵 안에서 딜") //
                    .add("연합군(아제나, 아델, 라하르트)", "162줄 아제나, 110줄 쫄몹 진입 후 아델+추가 아델,내부 50줄 외부 쉴드 파괴시 아델, 50줄 아제나 or 아델") //
                    .add("중요 기믹", "- 50줄 이하 하늘에서 똥 떨어진 후 협카\n- 전방 잡기 패턴 실패시 범위 잡기 주의")) //

                    , createMessageEmbed("노말 2관 욕망의 주인, 에키드나", "https://i.imgur.com/mVK4Gy9.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 수폭 아드\n서폿) 물약 암/회수 수폭 각물\nㅤ") //
                    .add("7분 40초 파리지옥 패턴", "보스에게서 멀이 떨어져 파리지옥 회피 or 서폿 풀쉴드 후 벅히기") //
                    .add("반 정산 패턴", "원에만 안겹치게 보스까지 선 잇기") //
                    .add("210줄 거울 카운터 패턴", "1왼 2오 나눠져서 카운터") //
                    .add("3분 30초 그네 패턴", "보스에게서 멀리 떨어지기, 나비 기절 주의") //
                    .add("풀 정산 패턴", "원에만 안겹치게 보스까지 선 잇기") //
                    .add("2분 파리지옥 패턴", "파리지옥 한번 더") //
                    .add("137줄 왕키드나 패턴", "3번 기절 레이저 회피 후 협카 및 라하르트+짤 무력후 대기, 격돌 본 다음 무력") //
                    .add("120줄 격돌 패턴", "윗뱀 라하라트 후 62줄까지 밀고 아랫뱀 밀기\n- 아랫뱀 격돌 필수") //
                    .add("반 정산 패턴", "히든 에페르니아로 스킵 풀딜") //
                    .add("격돌 패턴", "검은 뱀 격돌 잡으면서 처치") //
                    .add("풀 정산 패턴", "보스 헤드 피하면서 타수로 뱀 처리\n- 히든에페나 윗뱀 미처치시 주시뱀 등장, 2초 쳐다보고 돌려야 처치가능") //
                    .add("54줄 거울 무력 패턴", "거울의 등을 따라가면서 무력, 거울 등만 봐야함") //
                    .add("연합군(아제나, 아델, 라하르트)", "210줄 거울 카운터 아제나, 137 왕키드나 협카 후 라하르트, 120줄 12시 흰뱀 격돌 라하르트, 지하 반정산 에페르니아") //
                    .add("중요 기믹", "- 지상 똥 관리 필수 2번 깔거나 장판을 가두면 꽃 발생하며 꽃은 매혹 유발\n- 일부 패턴 매혹의 속삭임 쌓음, 3스택시 매혹")) //

                    , createMessageEmbed("하드 1관 붉은 재앙, 다르키엘", "https://i.imgur.com/EhcqWOA.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 아드\n서폿) 물약 암/회수 각물\nㅤ") //
                    .add("180줄 쫄 처리 패턴", "처음 용 브레스 주의하고 1왼2오 쫄몹 잡고 무력하기") //
                    .add("162줄 달리기 후 무력 패턴", "달리기 하고 중간에 짤몹 및 네임드 잡고 도착하여 무력") //
                    .add("135줄 알비온 협카 패턴", "다른 색깔 줄 안전지대, 2개의 그룹이 서로 겹치는 곳이 안전, 4번째 다르키엘의 수직(위/오른쪽)이 협카") //
                    .add("110줄 3쫄 패턴", "아델을 사용하여 짤몹 잡기") //
                    .add("90줄 내부 파티 이동 패턴", "내부 파티 이동하며 가서 무력 후 딜몰") //
                    .add("내부 62줄 부채 안전지대 패턴", "내부 부채 가로/세로 브리핑, 부채 반시계시 안/밖 반전") //
                    .add("내부 50줄 향로 패턴", "내부 쫄잡고 향로색 브리핑, 외부 색 브리핑에 맞춰 향로 파괴\n외부 향로 파괴후 내부는 무력화, 내부 무력화 외부는 쉴드 파괴(반사 주의)") //
                    .add("50줄 광폭화", "향로 돌아가면서 관리, 100스택시 사망 7~80스택시 교환\n- 100스택시 사망") //
                    .add("연합군(아제나, 아델, 라하르트)", "162줄 아제나, 110줄 쫄몹 진입 후 아델+추가 아델,내부 50줄 외부 쉴드 파괴시 아델, 50줄 아제나 or 아델") //
                    .add("중요 기믹", "- 50줄 이하 하늘에서 똥 떨어진 후 협카\n- 전방 잡기 패턴 실패시 범위 잡기 주의\n- 50줄이하 장판 겹쳐 깔기, 밟고있으면 향로 스택 증가, 100스택 숭고한 희생으로 전체 장판 제거 가능(다르키엘 딜증)")) //

                    , createMessageEmbed("하드 2관 욕망의 주인, 에키드나", "https://i.imgur.com/0cGwZjG.png", new MessageEmbedFileds() //
                    .add("배틀 아이템", "딜러) 물약 암/회수 수폭 아드\n서폿) 물약 암/회수 수폭 각물\nㅤ") //
                    .add("7분 40초 파리지옥 패턴", "보스에게서 멀이 떨어져 파리지옥 회피 or 서폿 풀쉴드 후 벅히기") //
                    .add("반 정산 패턴", "원에만 안겹치게 보스까지 선 잇기") //
                    .add("210줄 거울 카운터 패턴", "1왼 2오 나눠져서 레이저 피하면서 카운터\n- 종료 후 아제나") //
                    .add("3분 30초 그네 패턴", "보스에게서 멀리 떨어지기, 나비 기절 주의") //
                    .add("풀 정산 패턴", "원에만 안겹치게 보스까지 선 잇기") //
                    .add("2분 파리지옥 패턴", "파리지옥 한번 더") //
                    .add("137줄 왕키드나 패턴", "3번 기절 레이저 회피 후 협카(짭카 주의) 및 라하르트+짤 무력후 대기, 격돌 본 다음 무력") //
                    .add("120줄 격돌 패턴", "윗뱀 라하라트 후 62줄까지 밀고 아랫뱀 밀기\n- 아랫뱀 격돌 필수") //
                    .add("반 정산 패턴", "히든 에페르니아로 스킵 풀딜") //
                    .add("격돌 패턴", "검은 뱀 격돌 잡으면서 처치") //
                    .add("풀 정산 패턴", "보스 헤드 피하면서 타수로 뱀 처리, 주시자 위치에 쉴드뱀 등장, 기절로만 처리가능\n- 히든에페나 윗뱀 미처치시 주시뱀 등장, 2초 쳐다보고 돌려야 처치가능") //
                    .add("54줄 거울 무력 패턴", "시작 거울 기준으로 에키드나 왼쪽, 오른쪽 횟수 후 반시계/시계로 계산 후 야바위, 진짜 거울 찾아서 무력") //
                    .add("0줄->66줄 거울 무력 패턴", "3패턴 1번 잡기 반복, 3곳 브리핑 중 1or2 중 하나 짭카 나머지 2개 카운터 후 아제나") //
                    .add("연합군(아제나, 아델, 라하르트)", "210줄 거울 카운터 아제나, 137 왕키드나 협카 후 라하르트, 120줄 12시 흰뱀 격돌 라하르트, 지하 반정산 에페르니아, 발악 이후 아제나") //
                    .add("중요 기믹", "- 지상 똥 관리 필수 2번 깔거나 장판을 가두면 꽃 발생하며 꽃은 매혹 유발\n- 일부 패턴 매혹의 속삭임 쌓음, 3스택시 매혹")) //
            };
        }
    }

    //
    ;
    protected final String description;
    protected final StringSelectMenu menu;
    protected final Color color;

    Info(Color color, String description, String... menus) {
        this.color = color;
        this.description = description;
        this.menu = MessageStore.getStringSelectMenu(this.name(), "관문 선택하기", createStringSelects(menus));
    }

//    public String getDescription() {
//        return description;
//    }

    public abstract MessageEmbed[] getEmbeds();

    public StringSelectMenu getMenu() {
        return this.menu;
    }

    public static Info[] 군단장레이드() {
        return new Info[]{발탄, 비아키스, 쿠크세이튼, 아브렐슈드, 일리아칸, 카멘};
    }

    public static Info[] 어비스던전() { return new Info[]{카양겔, 혼돈의_상아탑};}

    public static Info[] 카제로스레이드() {
        return new Info[]{에키드나};
    }

    private static MessageStore.StringSelect[] createStringSelects(String... args) {
        List<MessageStore.StringSelect> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            list.add(new MessageStore.StringSelect(args[i], i + ""));
        return list.toArray(MessageStore.StringSelect[]::new);
    }

    protected MessageEmbed createMessageEmbed(String description, String imageUrl, MessageEmbedFileds fileds) {
        EmbedBuilder builder = new EmbedBuilder().setAuthor(this.name()).setColor(this.color).setTitle(this.description).setDescription(description).setImage(imageUrl);
        for (MessageEmbedFiled filed : fileds.list)
            builder.addField(filed.getField());
        return builder.build();
    }

    private static class MessageEmbedFileds {
        private final List<MessageEmbedFiled> list;

        public MessageEmbedFileds() {
            this.list = new ArrayList<>();
        }

        public MessageEmbedFileds add(String name, String value) {
            return add(name, value, false);
        }

        public MessageEmbedFileds add(String name, String value, boolean inline) {
            return add(new MessageEmbedFiled(name, value, inline));
        }

        public MessageEmbedFileds add(MessageEmbedFiled filed) {
            this.list.add(filed);
            return this;
        }
    }

    private static class MessageEmbedFiled {
        private final String name;
        private final String value;
        private final boolean inline;

        public MessageEmbedFiled(String name, String value) {
            this(name, value, false);
        }

        public MessageEmbedFiled(String name, String value, boolean inline) {
            this.name = name;
            this.value = value;
            this.inline = inline;
        }

        public MessageEmbed.Field getField() {
            return new MessageEmbed.Field(name, value, inline);
        }
    }

}
