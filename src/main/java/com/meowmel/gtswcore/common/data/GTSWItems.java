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

    //示例
    //    public static ItemEntry<Item> MAINFRAME_IV = REGISTRATE.item("micro_processor_mainframe", Item::new)
    //            .lang("Microprocessor Mainframe")
    //            .register();
    //筛网
    //钢筛网
    public static final ItemEntry<ComponentItem> STEEL_SIEVE_NET = REGISTRATE.item("steel_sieve_net", ComponentItem::create)
            .lang("Steel Sieve Net")
            .register();

    //铝筛网
    public static final ItemEntry<ComponentItem> ALUMINIUM_SIEVE_NET = REGISTRATE.item("aluminium_sieve_net", ComponentItem::create)
            .lang("Aluminium Sieve Net")
            .register();

    //不锈钢筛网
    public static final ItemEntry<ComponentItem> STAINLESS_STEEL_SIEVE_NET = REGISTRATE.item("stainless_steel_sieve_net", ComponentItem::create)
            .lang("Stainless Steel Sieve Net")
            .register();

    //钛筛网
    public static final ItemEntry<ComponentItem> TITANIUM_SIEVE_NET = REGISTRATE.item("titanium_sieve_net", ComponentItem::create)
            .lang("Titanium Sieve Net")
            .register();

    //钨钢筛网
    public static final ItemEntry<ComponentItem> TUNGSTEN_STEEL_SIEVE_NET = REGISTRATE.item("tungsten_steel_sieve_net", ComponentItem::create)
            .lang("Tungsten Steel Sieve Net")
            .register();

    public static <T extends IComponentItem> NonNullConsumer<T> attach(IItemComponent... components) {
        return item -> item.attachComponents(components);
    }

    public static void init() {}
}
