package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;

public enum Info {
    // 가디언

    // 군단장
    발탄("부활한 마수의 심장") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }
    }, 비아키스("목마른 쾌락의 정원") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }
    }, 쿠크세이튼("한방중의 서커스") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }
    }, 아브렐슈드("몽환의 아스텔지어") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }
    }, 일리아칸("부패한 군주의 판데모니움") {
        @Override
        public MessageEmbed[] getEmbeds() {
            return new MessageEmbed[0];
        }
    }, 카멘("어둠의 바라트론") {
        @Override
        public MessageEmbed[] getEmbeds() {
            MessageEmbed embed1 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("1관문 킬리네사") //
                    .setImage("https://i.imgur.com/EtyPHmU.png") //
                    .addField("배틀 아이템","딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ",false)//
                    .addField("145 촉수 패턴", "번호x3, 번호x3+1 자리에서\n촉수에 파폭 던지고 보스 무력하기\n\n보스 무력 후 보스 정면 레이저 및 운석 피하기\nㅤ", false) //
                    .addField("100 권능 패턴", "보스가 중앙으로 가고, 웨이 대사가 나올 떄 바훈 쓰기\n바훈 이후에 파란 장판 피하기\n나오는 촉수 하나당 2명씩 짝지어서\n 촉수에 파폭 or 파괴 스킬 쓰고 파괴되면 나오는\n노란색 장판 맞아 하늘로 올라가기\n- 기믹 시작 조건\n125줄 이후 카운터 후 칼리네사가 레이저를 쏘는데, 3곳의 구멍중 한곳으로 2번 넣으면 기믹이 발동하며 이것을 못하면 기믹 실패\nㅤ", false) //
                    .addField("55 촉수 패턴", "145줄 패턴 반복, 웨이 사용 가능\nㅤ", false) //
                    .addField("50 눈깔 패턴(0줄까지)", "바닥에 생기는 눈 밟아 주기, 눈위에 붉은 색 표식 바라보면 검은 게이지가 참\n 안 바라보면 다시 게이지가 줄어듬\n게이지 닷 차면 속박 걸리니 적당히 관리하면서 밝기\nㅤ", false) //
                    .addField("에스더(실리안, 웨이, 바훈투르)","144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르를 통하여 기믹 파훼 진행 가능\nㅤ",false)//
                    .addField("특이사항","- 유기체 버프\n유기체 제거시 쌓이며 10스택까지 쌓을 수 있음\n바훈투르 적용시 스택당 공격력+파괴+공이속 증가 및 상피면, 출혈 면역\n\n - 어그로\n랜덤 어글자 과녁이 생기는데 그동안 보스 데미지 감소\n공대원이 시야를 가려주면 데미지감소 제거 가능\n- 엔드로핀\n모든 공대원이 유기체 버프 1개 이상에 바훈투르 적용시 발동\n자기 체력 15줄을 실드로 전환하며 공대원이 25초 내 실드를 깍아야함\n모든 체력 기믹을 무시하고 딜을 넣을 수 있으며 실드 이후에도 버프가 남아있어 폭딜 가능\nㅤ",false)//
                    .build(); //
            MessageEmbed embed2 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("2관문 킬리네사") //
                    .setImage("https://i.imgur.com/EtyPHmU.png") //
                    .addField("배틀 아이템","딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물",false)//
                    .addField("145 촉수 패턴", "번호x3, 번호x3+1 자리에서\n촉수에 파폭 던지고 보스 무력하기\n\n보스 무력 후 보스 정면 레이저 및 운석 피하기\nㅤ", false) //
                    .addField("100 권능 패턴", "보스가 중앙으로 가고, 웨이 대사가 나올 떄 바훈 쓰기\n바훈 이후에 파란 장판 피하기\n나오는 촉수 하나당 2명씩 짝지어서\n 촉수에 파폭 or 파괴 스킬 쓰고 파괴되면 나오는\n노란색 장판 맞아 하늘로 올라가기\nㅤ", false) //
                    .addField("55 촉수 패턴", "145줄 패턴 반복, 웨이 사용 가능\nㅤ", false) //
                    .addField("50 눈깔 패턴(0줄까지)", "바닥에 생기는 눈 밟아 주기, 눈위에 붉은 색 표식 바라보면 검은 게이지가 참\n 안 바라보면 다시 게이지가 줄어듬\n게이지 닷 차면 속박 걸리니 적당히 관리하면서 밝기\nㅤ", false) //
                    .build(); //
            return new MessageEmbed[]{embed1,embed2};
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

    public static Info[] getCommander() {
        return new Info[]{발탄, 비아키스, 쿠크세이튼, 아브렐슈드, 일리아칸, 카멘};
    }
}
