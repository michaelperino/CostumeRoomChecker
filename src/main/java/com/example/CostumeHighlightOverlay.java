package com.example;

import net.runelite.api.ItemComposition;
import net.runelite.api.ItemID;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.WidgetOverlay;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class CostumeHighlightOverlay extends WidgetItemOverlay {
    private final ItemManager itemMan;
    private final ExampleConfig config;

    @Inject
    private CostumeHighlightOverlay(ItemManager itemMan, ExamplePlugin plugin, ExampleConfig config)
    {
        this.config = config;
        this.itemMan = itemMan;
        showOnBank();
    }

    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemID, WidgetItem itemWidget)
    {
        Color highlightColor = config.getHouseColor();
        if(checkStorability(itemID))
        {
            Rectangle bounds = itemWidget.getCanvasBounds();
            final BufferedImage outline = itemMan.getItemOutline(itemID, itemWidget.getQuantity(), highlightColor);
            graphics.drawImage(outline, (int) bounds.getX(), (int) bounds.getY(), null);
        }
    }

    private boolean checkStorability(int itemID)
    {
        if(itemID == 13387) return true;
        return false;
    }
}
