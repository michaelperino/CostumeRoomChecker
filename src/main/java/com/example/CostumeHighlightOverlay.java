package com.example;

import com.example.items.*;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemID;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class CostumeHighlightOverlay extends WidgetItemOverlay {
    private final ItemManager itemMan;
    private final ExampleConfig config;
    private ToyBox toyBox;
    private ArmorCase armorCase;
    private CapeRack capeRack;
    private FancyDressBox fancyDressBox;
    private MagicWardrobe magicWardrobe;
    private TreasureChest treasureChest;

    @Inject
    private CostumeHighlightOverlay(ItemManager itemMan, ExamplePlugin plugin, ExampleConfig config)
    {
        this.config = config;
        this.itemMan = itemMan;
        this.toyBox = new ToyBox();
        this.armorCase = new ArmorCase();
        this.capeRack = new CapeRack();
        this.fancyDressBox = new FancyDressBox();
        this.magicWardrobe = new MagicWardrobe();
        this.treasureChest = new TreasureChest();
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
        if(toyBox.checkList(itemID)) return true;
        if(armorCase.checkList(itemID)) return true;
        if(capeRack.checkList(itemID)) return true;
        if(fancyDressBox.checkList(itemID)) return true;
        if(magicWardrobe.checkList(itemID)) return true;
        if(treasureChest.checkList(itemID)) return true;
        return false;
    }
}
