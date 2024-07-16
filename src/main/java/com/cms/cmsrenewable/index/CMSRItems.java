package com.cms.cmsrenewable.index;

import com.cms.cmsrenewable.CMSRenewable;
import com.cms.cmsrenewable.groups.ModGroup;
import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class CMSRItems {
    private static final CreateRegistrate REGISTRATE = CMSRenewable.registrate()
            .creativeModeTab(() -> ModGroup.MAIN);

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_ELYTRA =
            REGISTRATE.item("incomplete_elytra", SequencedAssemblyItem::new)
                    .properties(p -> p.stacksTo(1))
                    .register();

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_NETHERITE_SCRAP =
            REGISTRATE.item("incomplete_netherite_scrap", SequencedAssemblyItem::new)
                    .register();

    public static final ItemEntry <Item> IRON_ELYTRA_FRAME =
            REGISTRATE.item("iron_elytra_frame", Item::new)
                    .properties(p -> p.stacksTo(1))
                    .register();

    public static final ItemEntry <Item> NETHERITE_SLAG =
            REGISTRATE.item("netherite_slag", Item::new)
                    .register();

    public static final ItemEntry <Item> CLEAN_COAL =
            REGISTRATE.item("clean_coal", Item::new)
                    .register();

    public static final ItemEntry <Item> DIAMOND_SEED =
            REGISTRATE.item("diamond_seed", Item::new)
                    .register();

    public static final ItemEntry <Item> DIAMOND_CATALYTIC_SUBSTRATE =
            REGISTRATE.item("diamond_catalytic_substrate", Item::new)
                    .register();

    public static final ItemEntry <Item> CARBON_COATED_DIAMOND_SEED =
            REGISTRATE.item("carbon_coated_diamond_seed", Item::new)
                    .register();

    public static final ItemEntry <Item> UNPOLISHED_DIAMOND =
            REGISTRATE.item("unpolished_diamond", Item::new)
                    .register();

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_UNPOLISHED_DIAMOND =
            REGISTRATE.item("incomplete_unpolished_diamond", SequencedAssemblyItem::new)
                    .register();

    public static void register() {}
}
