package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.interactions.components.selections.EntitySelectMenu;
import net.dv8tion.jda.api.interactions.components.selections.SelectOption;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MessageStore {
    public static Button getButton(String id, String label) {
        return Button.primary(id, label);
    }

    public static EntitySelectMenu getEntitySelectMenu(String customId, EntitySelectMenu.SelectTarget target, String placeholder, int min, int max, EntitySelectMenu.SelectTarget... extraTargets) {
        return EntitySelectMenu.create(customId, target, extraTargets).setPlaceholder(placeholder).setRequiredRange(min, max).build();
    }
    public static StringSelectMenu getStringSelectMenu(String customID, String placeholder,  int max, StringSelect... stringSelects) {
        StringSelectMenu.Builder builder = StringSelectMenu.create(customID).setPlaceholder(placeholder);
        for (StringSelect stringSelect : stringSelects)
            builder = stringSelect.apply(builder);
        return builder.setRequiredRange(0, max).build();
    }
    public static StringSelectMenu getStringSelectMenu(String customID, String placeholder, int min, int max, StringSelect... stringSelects) {
        StringSelectMenu.Builder builder = StringSelectMenu.create(customID).setPlaceholder(placeholder);
        for (StringSelect stringSelect : stringSelects)
            builder = stringSelect.apply(builder);
        return builder.setRequiredRange(min, max).build();
    }

    public static StringSelectMenu getStringSelectMenu(String customID, String placeholder, StringSelect... stringSelects) {
        StringSelectMenu.Builder builder = StringSelectMenu.create(customID).setPlaceholder(placeholder);
        for (StringSelect stringSelect : stringSelects)
            builder = stringSelect.apply(builder);
        return builder.setMinValues(0).build();
    }

    public static class StringSelect {
        private final String label;
        private final String value;
        private final String description;
        private final Emoji emoji;
        private final boolean has;

        public StringSelect(@NotNull String label, @NotNull String value) {
            this(label, value, null, null, false);
        }

        public StringSelect(@NotNull String label, @NotNull String value, boolean has) {
            this(label, value, null, null, has);
        }

        public StringSelect(@NotNull String label, @NotNull String value, @Nullable Emoji emoji, boolean has) {
            this(label, value, null, emoji, has);
        }

        public StringSelect(@NotNull String label, @NotNull String value, @Nullable String description, @Nullable Emoji emoji, boolean has) {
            this.label = label;
            this.value = value;
            this.description = description;
            this.emoji = emoji;
            this.has = has;
        }

        public StringSelectMenu.Builder apply(StringSelectMenu.Builder builder) {
            SelectOption option = SelectOption.of(label, value);
            if (description != null)
                option = option.withDescription(description);
            if (emoji != null)
                option = option.withEmoji(emoji);
            return builder.addOptions(option.withDefault(has));
        }

        public static StringSelect getRole(Guild guild, JobEmoji jobEmoji, boolean main, Member member) {
            Role role = main ? jobEmoji.getMainRole(guild) : jobEmoji.getSubRole(guild);
            return new StringSelect(role.getName(), role.getId(), jobEmoji.getEmoji(guild), member.getRoles().contains(role));
        }

        public static StringSelect getRole(Guild guild, ServerEmoji serverEmoji, Member member) {
            Role role = serverEmoji.getRole(guild);
            return new StringSelect(role.getName(), role.getId(), serverEmoji.getEmoji(guild), member.getRoles().contains(role));
        }

        public static StringSelect getInfo(Guild guild, Info info, Member member) {
            return new StringSelect(info.name(), info.name());
        }
    }

}
