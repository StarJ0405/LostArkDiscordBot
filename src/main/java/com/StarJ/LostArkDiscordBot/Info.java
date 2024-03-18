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
                    .setDescription("1관문 기도하는 자, 킬리네사") //
                    .setImage("https://i.imgur.com/mlnLy87.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 파폭 아드\n서폿) 물약 암수 파폭 각물\nㅤ", false)//
                    .addField("145줄 촉수 패턴", "번호x3, 번호x3+1 자리에서\n촉수에 파폭 던지고 보스 무력하기\n\n보스 무력 후 보스 정면 레이저 및 운석 피하기\nㅤ", false) //
                    .addField("100줄 권능 패턴", "보스가 중앙으로 가고, 웨이 대사가 나올 떄 바훈 쓰기\n바훈 이후에 파란 장판 피하기\n나오는 촉수 하나당 2명씩 짝지어서\n 촉수에 파폭 or 파괴 스킬 쓰고 파괴되면 나오는\n노란색 장판 맞아 하늘로 올라가기\n- 기믹 시작 조건\n125줄 이후 카운터 후 칼리네사가 레이저를 쏘는데, 3곳의 구멍중 한곳으로 2번 넣으면 기믹이 발동하며 이것을 못하면 기믹 실패\nㅤ", false) //
                    .addField("55줄 촉수 패턴", "145줄 패턴 반복, 웨이 사용 가능\nㅤ", false) //
                    .addField("50줄 눈깔 패턴(0줄까지)", "바닥에 생기는 눈 밟아 주기, 눈위에 붉은 색 표식 바라보면 검은 게이지가 참\n 안 바라보면 다시 게이지가 줄어듬\n게이지 닷 차면 속박 걸리니 적당히 관리하면서 밝기\nㅤ", false) //
                    .addField("에스더(실리안, 웨이, 바훈투르)", "144줄 바훈투르, 32줄 바훈투르(인원 부족시 실리안)\n - 히든(100줄) 기믹 실패시 웨이 대사때 바훈투르를 통하여 기믹 파훼 진행 가능\nㅤ", false)//
                    .addField("중요 기믹", "- 유기체 버프\n유기체 제거시 쌓이며 10스택까지 쌓을 수 있음\n바훈투르 적용시 스택당 공격력+파괴+공이속 증가 및 상피면, 출혈 면역\n\n - 어그로\n랜덤 어글자 과녁이 생기는데 그동안 보스 데미지 감소\n공대원이 시야를 가려주면 데미지감소 제거 가능\n- 엔드로핀\n모든 공대원이 유기체 버프 1개 이상에 바훈투르 적용시 발동\n자기 체력 15줄을 실드로 전환하며 공대원이 25초 내 실드를 깍아야함\n모든 체력 기믹을 무시하고 딜을 넣을 수 있으며 실드 이후에도 버프가 남아있어 폭딜 가능\nㅤ", false)//
                    .build(); //
            MessageEmbed embed2 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("2관문 어둠의 기사, 발리나크") //
                    .setImage("https://i.imgur.com/4cJTRnb.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 시정 or 아드\n서폿) 물약 암수 파폭 시정 or 각물\nㅤ", false)//
                    .addField("135줄 7카+막카 후 달리기 패턴", "떨어지는 번개똥을 빼고 1파티부터 번호순으로 7카후 마지막 카운터\n- 마지막 카운터가 빨간색인 경우 가짜 카운터로, 파란색이 뜬 후 치면 됨\nㅤ", false) //
                    .addField("72줄 구슬 넣기 패턴", "보스가 중앙으로 이동후 무력화게이지가 뜨며 색깔이 보이는데 색깔과 반대되는 색깔의 구슬을 보스에게 넣어주면 됨\n주시자가존재하며 레이저를 쏘는데 구슬이 없는 쪽으로 유도해야함\n- 구슬이 맞을경우 구슬이 터짐\n- 실수로 인해 부족한 무력은 직접 무력으로 파훼 가능\nㅤ", false) //
                    .addField("50줄 전기벽 패턴", "보스가 날아가고 주변에 어둠이 생기며 중앙에 안전지대가 생김\n중앙에 있다가 안전지대가 퍼짐에 맞춰 바깥으로 나가야함\n맵 외각에 전기벽이 생기며 본인 자리에 에어본을 일으키는 똥이 발사되니 주의\n마지막까지 남는 전기벽을 찾아 밀려오는 파도를 벽 뒤에서 막으면 생존\nㅤ", false) //
                    .addField("18줄 쫄몹 타임어택 패턴", "맵 외각에 나가면 피해를 입는 상태로 바뀌며 쫄몹이 등장함\n쫄몹은 작은몹 중간몹 큰몹으로 총 3번의 스테이지 구성\n쫄몹을 잡지 못하면 전멸급 데미지가 들어오며 시정으로 파훼가능\n- 2번째 쫄몹 잡을때 떨어지는 기절 번개 주의\n- 3번쨰 쫄몹은 카운터를 치지않고 돌진을 유도한 후 에스더 실리안을 통하여 잡음\n- 단 3번쨰 쫄몹중 카운터가 나온 쫄몹은 실리안 이후에도 약간의 데미지가 필요함\n- 패턴 실패시 보스 체력이 일정량까지 회복함\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 이난나)", "135줄 달리기 패턴이후 중간에 보스 조우 후 30초정도 뒤에 좌우로 바람을 날리는 패턴을 하는데 그때 히든 아제나 사용\n18줄 쫄몹 잡을때 실리안 사용\nㅤ", false)//
                    .addField("중요 기믹", "보스 등에게 검푸른색 피해를 받는 경우 짧은 시간동안 받는 피해가 증가함(스택 쌓임)\n- 디버프가 있는 상태로 하얀색 계통 피해를 받는 경우 그 자리에 터지는 작은 검은 구체가 발생하여 매우 큰 데미지를 유발(범위내 아군 전부 피해)\n135줄 이후 2페이즈 보스에게 도달하고 똥을 주는 일반 패턴이 있는데, 해당 똥이 일정 이상 쌓이면 전멸\n- 하얀색 구체를 구체를 주는 패턴에서 하얀 구체를 똥장판에서 터뜨릴시 똥 제거\n- 럴커 패턴으로 주변에 가시가 올라오고 보스 밑에 빨간색 장판이 생기며 크게 찍는데 이때 확정으로 생기는 똥들을 보스 밑에 깔경우 장판 제거\n- 단, 똥이 2개 겹치면 큰똥으로 바뀌는데 이것이 지우는 기믹으로 지울시 매우 큰 범위에 즉사급 데미지\nㅤ", false)//
                    .build(); //
            MessageEmbed embed3 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("3관문 빛을 꺼트리는 자, 카멘") //
                    .setImage("https://i.imgur.com/hT2domt.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 파폭 각물\nㅤ", false)//
                    .addField("패턴", "\nㅤ", false) //
                    .addField("패턴", "\nㅤ", false) //
                    .addField("패턴", "\nㅤ", false) //
                    .addField("패턴", "\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 이난나)", "\nㅤ", false)//
                    .addField("중요 기믹", "\nㅤ", false)//동안 보스 데미지 감소\n공대원이 시야를 가려주면 데미지감소 제거 가능\n- 엔드로핀\n모든 공대원이 유기체 버프 1개 이상에 바훈투르 적용시 발동\n자기 체력 15줄을 실드로 전환하며 공대원이 25초 내 실드를 깍아야함\n모든 체력 기믹을 무시하고 딜을 넣을 수 있으며 실드 이후에도 버프가 남아있어 폭딜 가능\nㅤ", false)//
                    .build(); //
            MessageEmbed embed4 = new EmbedBuilder().setAuthor(this.name()) //
                    .setColor(Color.BLUE).setTitle(this.description) //
                    .setDescription("4관문 종말의 시(時), 카멘") //
                    .setImage("https://i.imgur.com/4cJTRnb.png") //
                    .addField("배틀 아이템", "딜러) 물약 암수 성부 아드\n서폿) 물약 암수 파폭 각물\nㅤ", false)//
                    .addField("300줄 칼 무력 패턴", "\nㅤ", false) //
                    .addField("275줄 알비온 패턴", "\nㅤ", false) //
                    .addField("255줄 칼 소환 패턴", "\nㅤ", false) //
                    .addField("225줄 안전지대 찾기 패턴(별칭 : 실리안)", "\nㅤ", false) //
                    .addField("210줄 말타기 후 격돌 패턴", "\nㅤ", false) //
                    .addField("쉴드제거 패턴", "\nㅤ", false) //
                    .addField("1지파 패턴", "\nㅤ", false) //
                    .addField("2지파 패턴", "\nㅤ", false) //
                    .addField("90줄 지하 이동 패턴", "\nㅤ", false) //
                    .addField("55줄 반전 패턴", "\nㅤ", false) //
                    .addField("35줄 마지막 격돌 패턴", "\nㅤ", false) //
                    .addField("에스더(실리안, 아제나, 이난나)", "\nㅤ", false)//
                    .addField("중요 기믹", "\nㅤ", false)//
                    .build(); //
            return new MessageEmbed[]{embed1, embed2, embed3, embed4};
        }

        @Override
        public StringSelectMenu getMenu() {
            List<MessageStore.StringSelect> list = new ArrayList<>();
            list.add(new MessageStore.StringSelect("1관문", "0"));
            list.add(new MessageStore.StringSelect("2관문", "1"));
            list.add(new MessageStore.StringSelect("3관문", "2"));
            list.add(new MessageStore.StringSelect("4관문", "3"));
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
        return new Info[]{발탄, 비아키스, 쿠크세이튼, 아브렐슈드, 일리아칸, 카멘};
    }
}
