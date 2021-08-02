package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import java.awt.Color;

@ConfigGroup("example")
public interface ExampleConfig extends Config
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
}
