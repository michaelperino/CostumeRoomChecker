package com.CosRoom.items;

import net.runelite.api.ItemID;

import java.util.HashSet;

public class MagicWardrobe {
    private final HashSet<Integer> MagicWardrobeHash;

    public boolean checkList(int Item)
    {
        return this.MagicWardrobeHash.contains(Item);
    }
    public MagicWardrobe()
    {
        this.MagicWardrobeHash = new HashSet<Integer>();
        this.MagicWardrobeHash.add(ItemID.AMYS_SAW);
        this.MagicWardrobeHash.add(ItemID.ANCESTRAL_HAT);
        this.MagicWardrobeHash.add(ItemID.ANCESTRAL_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.ANCESTRAL_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.TWISTED_ANCESTRAL_HAT);
        this.MagicWardrobeHash.add(ItemID.TWISTED_ANCESTRAL_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.TWISTED_ANCESTRAL_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.ANCIENT_CEREMONIAL_TOP);
        this.MagicWardrobeHash.add(ItemID.ANCIENT_CEREMONIAL_LEGS);
        this.MagicWardrobeHash.add(ItemID.ANCIENT_CEREMONIAL_MASK);
        this.MagicWardrobeHash.add(ItemID.ANCIENT_CEREMONIAL_GLOVES);
        this.MagicWardrobeHash.add(ItemID.ANCIENT_CEREMONIAL_BOOTS);
        this.MagicWardrobeHash.add(ItemID.BLOODBARK_HELM);
        this.MagicWardrobeHash.add(ItemID.BLOODBARK_BODY);
        this.MagicWardrobeHash.add(ItemID.BLOODBARK_LEGS);
        this.MagicWardrobeHash.add(ItemID.BLOODBARK_GAUNTLETS);
        this.MagicWardrobeHash.add(ItemID.BLOODBARK_BOOTS);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_1);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_2);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_3);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_4);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_5);
        this.MagicWardrobeHash.add(ItemID.BOUNTY_HUNTER_HAT_TIER_6);
        this.MagicWardrobeHash.add(ItemID.BRUMA_TORCH);
        this.MagicWardrobeHash.add(ItemID.CARPENTERS_HELMET);
        this.MagicWardrobeHash.add(ItemID.CARPENTERS_SHIRT);
        this.MagicWardrobeHash.add(ItemID.CARPENTERS_TROUSERS);
        this.MagicWardrobeHash.add(ItemID.CARPENTERS_BOOTS);
        this.MagicWardrobeHash.add(ItemID.DAGONHAI_HAT);
        this.MagicWardrobeHash.add(ItemID.DAGONHAI_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.DAGONHAI_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.DARK_FLIPPERS);
        this.MagicWardrobeHash.add(ItemID.DARK_SQUALL_HOOD);
        this.MagicWardrobeHash.add(ItemID.DARK_SQUALL_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.DARK_SQUALL_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_HOOD);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_TOP);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_ROBE);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_HOOD_OR);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_TOP_OR);
        this.MagicWardrobeHash.add(ItemID.ELDER_CHAOS_ROBE_OR);
        this.MagicWardrobeHash.add(ItemID.EVIL_CHICKEN_HEAD);
        this.MagicWardrobeHash.add(ItemID.EVIL_CHICKEN_WINGS);
        this.MagicWardrobeHash.add(ItemID.EVIL_CHICKEN_LEGS);
        this.MagicWardrobeHash.add(ItemID.EVIL_CHICKEN_FEET);
        this.MagicWardrobeHash.add(ItemID.FISH_SACK);
        this.MagicWardrobeHash.add(ItemID.FISH_SACK_BARREL);
        this.MagicWardrobeHash.add(ItemID.BRONZE_FIST_FLAG);
        this.MagicWardrobeHash.add(ItemID.CUTTHROAT_FLAG);
        this.MagicWardrobeHash.add(ItemID.GILDED_SMILE_FLAG);
        this.MagicWardrobeHash.add(ItemID.LUCKY_SHOT_FLAG);
        this.MagicWardrobeHash.add(ItemID.PHASMATYS_FLAG);
        this.MagicWardrobeHash.add(ItemID.TREASURE_FLAG);
        this.MagicWardrobeHash.add(ItemID.FORESTRY_BASKET);
        this.MagicWardrobeHash.add(ItemID.FORESTRY_KIT);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_HOOD);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_ROBE);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_ROBE_6108);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_CLOAK);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_GLOVES);
        this.MagicWardrobeHash.add(ItemID.GHOSTLY_BOOTS);
        this.MagicWardrobeHash.add(ItemID.GOLDEN_TENCH);
        this.MagicWardrobeHash.add(ItemID.IMCANDO_HAMMER);
        this.MagicWardrobeHash.add(ItemID.INFINITY_HAT);
        this.MagicWardrobeHash.add(ItemID.INFINITY_TOP);
        this.MagicWardrobeHash.add(ItemID.INFINITY_BOTTOMS);
        this.MagicWardrobeHash.add(ItemID.INFINITY_GLOVES);
        this.MagicWardrobeHash.add(ItemID.INFINITY_BOOTS);
        this.MagicWardrobeHash.add(ItemID.DARK_INFINITY_HAT);
        this.MagicWardrobeHash.add(ItemID.DARK_INFINITY_TOP);
        this.MagicWardrobeHash.add(ItemID.DARK_INFINITY_BOTTOMS);
        this.MagicWardrobeHash.add(ItemID.INFINITY_GLOVES);
        this.MagicWardrobeHash.add(ItemID.INFINITY_BOOTS);
        this.MagicWardrobeHash.add(ItemID.LIGHT_INFINITY_HAT);
        this.MagicWardrobeHash.add(ItemID.LIGHT_INFINITY_TOP);
        this.MagicWardrobeHash.add(ItemID.LIGHT_INFINITY_BOTTOMS);
        this.MagicWardrobeHash.add(ItemID.INFINITY_GLOVES);
        this.MagicWardrobeHash.add(ItemID.INFINITY_BOOTS);
        this.MagicWardrobeHash.add(ItemID.FORESTRY_BASKET);
        this.MagicWardrobeHash.add(ItemID.LOG_BASKET);
        this.MagicWardrobeHash.add(ItemID.LUNAR_HELM);
        this.MagicWardrobeHash.add(ItemID.LUNAR_TORSO);
        this.MagicWardrobeHash.add(ItemID.LUNAR_LEGS);
        this.MagicWardrobeHash.add(ItemID.LUNAR_AMULET);
        this.MagicWardrobeHash.add(ItemID.LUNAR_CAPE);
        this.MagicWardrobeHash.add(ItemID.LUNAR_GLOVES);
        this.MagicWardrobeHash.add(ItemID.LUNAR_RING);
        this.MagicWardrobeHash.add(ItemID.LUNAR_BOOTS);
        this.MagicWardrobeHash.add(ItemID.MASK_OF_REBIRTH);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_HAT);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_HELM);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_ARMOUR);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_SKIRT);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_CAPE);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_GLOVES);
        this.MagicWardrobeHash.add(ItemID.MOONCLAN_BOOTS);
        this.MagicWardrobeHash.add(ItemID.MUDSKIPPER_HAT);
        this.MagicWardrobeHash.add(ItemID.FLIPPERS);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_HAT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_GLOVES);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_BOOTS);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_HAT_DARK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_TOP_DARK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_BOTTOM_DARK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_GLOVES_DARK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_BOOTS_DARK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_HAT_DUSK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_TOP_DUSK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_BOTTOM_DUSK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_GLOVES_DUSK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_BOOTS_DUSK);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_HAT_LIGHT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_TOP_LIGHT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_BOTTOM_LIGHT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_GLOVES_LIGHT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_BOOTS_LIGHT);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_HAT_OR);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_TOP_OR);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_ROBE_BOTTOM_OR);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_GLOVES_OR);
        this.MagicWardrobeHash.add(ItemID.MYSTIC_BOOTS_OR);
        this.MagicWardrobeHash.add(ItemID.BLACK_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.BLACK_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.BLACK_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.BLUE_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.BLUE_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.BLUE_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.BROWN_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.BROWN_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.BROWN_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.GREEN_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.GREEN_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.GREEN_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.GREY_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.GREY_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.GREY_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.PURPLE_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.PURPLE_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.PURPLE_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.RED_TRICORN_HAT);
        this.MagicWardrobeHash.add(ItemID.RED_NAVAL_SHIRT);
        this.MagicWardrobeHash.add(ItemID.RED_NAVY_SLACKS);
        this.MagicWardrobeHash.add(ItemID.OILY_PEARL_FISHING_ROD);
        this.MagicWardrobeHash.add(ItemID.PEARL_BARBARIAN_ROD);
        this.MagicWardrobeHash.add(ItemID.PEARL_FISHING_ROD);
        this.MagicWardrobeHash.add(ItemID.PEARL_FLY_FISHING_ROD);
        this.MagicWardrobeHash.add(ItemID.PHEASANT_HAT);
        this.MagicWardrobeHash.add(ItemID.PHEASANT_LEGS);
        this.MagicWardrobeHash.add(ItemID.PHEASANT_BOOTS);
        this.MagicWardrobeHash.add(ItemID.PHEASANT_CAPE);
        this.MagicWardrobeHash.add(ItemID.PYROMANCER_HOOD);
        this.MagicWardrobeHash.add(ItemID.PYROMANCER_GARB);
        this.MagicWardrobeHash.add(ItemID.PYROMANCER_ROBE);
        this.MagicWardrobeHash.add(ItemID.PYROMANCER_BOOTS);
        this.MagicWardrobeHash.add(ItemID.HAT_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.ROBE_TOP_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.ROBE_BOTTOMS_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.BOOTS_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.HAT_OF_THE_EYE_BLUE);
        this.MagicWardrobeHash.add(ItemID.ROBE_TOP_OF_THE_EYE_BLUE);
        this.MagicWardrobeHash.add(ItemID.ROBE_BOTTOMS_OF_THE_EYE_BLUE);
        this.MagicWardrobeHash.add(ItemID.BOOTS_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.HAT_OF_THE_EYE_GREEN);
        this.MagicWardrobeHash.add(ItemID.ROBE_TOP_OF_THE_EYE_GREEN);
        this.MagicWardrobeHash.add(ItemID.ROBE_BOTTOMS_OF_THE_EYE_GREEN);
        this.MagicWardrobeHash.add(ItemID.BOOTS_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.HAT_OF_THE_EYE_RED);
        this.MagicWardrobeHash.add(ItemID.ROBE_TOP_OF_THE_EYE_RED);
        this.MagicWardrobeHash.add(ItemID.ROBE_BOTTOMS_OF_THE_EYE_RED);
        this.MagicWardrobeHash.add(ItemID.BOOTS_OF_THE_EYE);
        this.MagicWardrobeHash.add(ItemID.HOOD_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.ROBE_TOP_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.ROBE_BOTTOM_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.GLOVES_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.SOCKS_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.CLOAK_OF_RUIN);
        this.MagicWardrobeHash.add(ItemID.SKELETAL_HELM);
        this.MagicWardrobeHash.add(ItemID.SKELETAL_TOP);
        this.MagicWardrobeHash.add(ItemID.SKELETAL_BOTTOMS);
        this.MagicWardrobeHash.add(ItemID.SKELETAL_BOOTS);
        this.MagicWardrobeHash.add(ItemID.SKELETAL_GLOVES);
        this.MagicWardrobeHash.add(ItemID.SMITHS_TUNIC);
        this.MagicWardrobeHash.add(ItemID.SMITHS_TROUSERS);
        this.MagicWardrobeHash.add(ItemID.SMITHS_BOOTS);
        this.MagicWardrobeHash.add(ItemID.SMITHS_GLOVES);
        this.MagicWardrobeHash.add(ItemID.SPLITBARK_HELM);
        this.MagicWardrobeHash.add(ItemID.SPLITBARK_BODY);
        this.MagicWardrobeHash.add(ItemID.SPLITBARK_LEGS);
        this.MagicWardrobeHash.add(ItemID.SPLITBARK_GAUNTLETS);
        this.MagicWardrobeHash.add(ItemID.SPLITBARK_BOOTS);
        this.MagicWardrobeHash.add(ItemID.SWAMPBARK_HELM);
        this.MagicWardrobeHash.add(ItemID.SWAMPBARK_BODY);
        this.MagicWardrobeHash.add(ItemID.SWAMPBARK_LEGS);
        this.MagicWardrobeHash.add(ItemID.SWAMPBARK_GAUNTLETS);
        this.MagicWardrobeHash.add(ItemID.SWAMPBARK_BOOTS);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ROBE);
        this.MagicWardrobeHash.add(ItemID.TRIBAL_TOP);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_HAT);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ARMBAND);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_SANDALS);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ROBE_6353);
        this.MagicWardrobeHash.add(ItemID.TRIBAL_TOP_6351);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_HAT_6355);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_SANDALS_6357);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ARMBAND_6359);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ROBE_6363);
        this.MagicWardrobeHash.add(ItemID.TRIBAL_TOP_6361);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_HAT_6365);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_SANDALS_6367);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ARMBAND_6369);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ROBE_6373);
        this.MagicWardrobeHash.add(ItemID.TRIBAL_TOP_6371);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_HAT_6375);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_SANDALS_6377);
        this.MagicWardrobeHash.add(ItemID.VILLAGER_ARMBAND_6379);
        this.MagicWardrobeHash.add(ItemID.VIRTUS_MASK);
        this.MagicWardrobeHash.add(ItemID.VIRTUS_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.VIRTUS_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.WARM_GLOVES);
        this.MagicWardrobeHash.add(ItemID.ZEALOTS_HELM);
        this.MagicWardrobeHash.add(ItemID.ZEALOTS_ROBE_TOP);
        this.MagicWardrobeHash.add(ItemID.ZEALOTS_ROBE_BOTTOM);
        this.MagicWardrobeHash.add(ItemID.ZEALOTS_BOOTS);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_11851);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_11853);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_11855);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_11857);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_11859);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_11861);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13579);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13580);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13581);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13582);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13583);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13584);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13585);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13586);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13587);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13588);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13589);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13590);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13591);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13592);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13593);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13594);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13595);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13596);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13597);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13598);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13599);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13600);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13601);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13602);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13603);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13604);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13605);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13606);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13607);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13608);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13609);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13610);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13611);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13612);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13613);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13614);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13615);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13616);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13617);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13618);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13619);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13620);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13621);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13622);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13623);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13624);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13625);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13626);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13627);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13628);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13629);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13630);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13631);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13632);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13633);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13634);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13635);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13636);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13637);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13638);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13667);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_13668);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13669);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_13670);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13671);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_13672);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13673);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_13674);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13675);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_13676);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13677);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_13678);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_21061);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_21063);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_21064);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_21066);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_21067);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_21069);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_21070);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_21072);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_21073);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_21075);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_21076);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_21078);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_24743);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_24745);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_24746);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_24748);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_24749);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_24751);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_24752);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_24754);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_24755);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_24757);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_24758);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_24760);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_25069);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_25071);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_25072);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_25074);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_25075);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_25077);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_25078);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_25080);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_25081);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_25083);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_25084);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_25086);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_27444);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_HOOD_27446);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_27447);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_CAPE_27449);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_27450);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_TOP_27452);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_27453);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_LEGS_27455);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_27456);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_GLOVES_27458);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_27459);
        this.MagicWardrobeHash.add(ItemID.GRACEFUL_BOOTS_27461);



    }
}
