package com.CosRoom;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import java.awt.Color;

@ConfigGroup("costumeroomchecker")
public interface CosRoomConfig extends Config
{
	@ConfigItem(
		keyName = "storeableColor",
		name = "Storable Color",
		description = "The color to highlight items that can be stored in a house"
	)
	default Color getHouseColor()
	{
		return Color.PINK;
	}

	@ConfigItem(
			keyName = "toyBoxEnable",
			name = "Enable Toy Box",
			description = "Choose if you wish to highlight the items that can be inserted into a toy box."
	)
	default boolean toyBoxEnabled()
	{
		return true;
	}

	@ConfigItem(
			keyName = "ArmorCase",
			name = "Enable Armor Case",
			description = "Choose if you wish to highlight the items that can be inserted into an armor case."
	)
	default boolean armorCaseEnabled()
	{
		return true;
	}

	@ConfigItem(
			keyName = "CapeRack",
			name = "Enable Cape Rack",
			description = "Choose if you wish to highlight the items that can be inserted into a cape rack."
	)
	default boolean CapeRackEnabled() { return true; }

	@ConfigItem(
			keyName = "FancyDressBox",
			name = "Enable Fancy Dress Box",
			description = "Choose if you wish to highlight the items that can be inserted into a fancy dress box."
	)
	default boolean FancyDressBoxEnabled() { return true; }

	@ConfigItem(
			keyName = "MagicWardrobe",
			name = "Enable Magic Wardrobe",
			description = "Choose if you wish to highlight the items that can be inserted into a magic wardrobe."
	)
	default boolean MagicWardrobeEnabled() { return true; }

	@ConfigItem(
			keyName = "TreasureChest",
			name = "Enable Treasure Chest",
			description = "Choose if you wish to highlight the items that can be inserted into a treasure chest."
	)
	default boolean TreasureChestEnabled() { return true; }
}
