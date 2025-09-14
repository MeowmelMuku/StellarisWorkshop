package com.meowmel.gtswcore.common.data;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.IComponentItem;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.gregtechceu.gtceu.common.item.TooltipBehavior;
import com.gregtechceu.gtceu.data.lang.LangHandler;

import com.meowmel.gtswcore.common.items.CompleteCardItemBehaviour;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;

import static com.meowmel.gtswcore.api.registries.GTSWRegistires.REGISTRATE;

public class GTSWItems {

    public static final ItemEntry<ComponentItem> COMPLETE_CARD = REGISTRATE.item("complete_card", ComponentItem::create)
            .lang("Complete card")
            .onRegister(attach(new TooltipBehavior(lines -> {
                lines.addAll(LangHandler.getMultiLang("item.gtsw.complete_card.tooltip"));
            })))
            .onRegister(attach(new CompleteCardItemBehaviour()))
            .defaultModel()
            .register();

    public static <T extends IComponentItem> NonNullConsumer<T> attach(IItemComponent... components) {
        return item -> item.attachComponents(components);
    }

    public static void init() {}
}
