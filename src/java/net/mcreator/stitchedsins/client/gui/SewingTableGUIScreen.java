package net.mcreator.stitchedsins.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stitchedsins.world.inventory.SewingTableGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SewingTableGUIScreen extends AbstractContainerScreen<SewingTableGUIMenu> {
	private final static HashMap<String, Object> guistate = SewingTableGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SewingTableGUIScreen(SewingTableGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stitched_sins:textures/screens/sewing_table_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("stitched_sins:textures/screens/needle_shadow.png"), this.leftPos + 25, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("stitched_sins:textures/screens/string_shadow.png"), this.leftPos + 133, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("stitched_sins:textures/screens/string.png"), this.leftPos + 69, this.topPos + 1, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("stitched_sins:textures/screens/string.png"), this.leftPos + 69, this.topPos + 33, 0, 0, 32, 32, 32, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
