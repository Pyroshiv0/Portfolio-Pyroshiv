package net.mcreator.golemsawakening.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.golemsawakening.world.inventory.InventoryGolemComposterMenu;
import net.mcreator.golemsawakening.procedures.IsGrassCheckedProcedure;
import net.mcreator.golemsawakening.procedures.Image7ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image6ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image5ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image4ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image3ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image2ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image1ConditionProcedure;
import net.mcreator.golemsawakening.procedures.Image0ConditionProcedure;
import net.mcreator.golemsawakening.procedures.DisplayEntityProcedure;
import net.mcreator.golemsawakening.network.InventoryGolemComposterButtonMessage;
import net.mcreator.golemsawakening.GolemsAwakeningMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InventoryGolemComposterScreen extends AbstractContainerScreen<InventoryGolemComposterMenu> {
	private final static HashMap<String, Object> guistate = InventoryGolemComposterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox grasschecked;
	ImageButton imagebutton_grass_checker;

	public InventoryGolemComposterScreen(InventoryGolemComposterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("golems_awakening:textures/screens/inventory_golem_composter.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		if (DisplayEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 35, this.topPos + 73, 30, 0f + (float) Math.atan((this.leftPos + 35 - mouseX) / 40.0), (float) Math.atan((this.topPos + 23 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Image0ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter0.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image1ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter1.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image2ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter2.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image3ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter3.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image4ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter4.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image5ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter5.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image6ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter6.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}
		if (Image7ConditionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/arrow_composter7.png"));
			this.blit(ms, this.leftPos + 115, this.topPos + 44, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("golems_awakening:textures/screens/.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 25, 0, 0, 54, 54, 54, 54);

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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.golems_awakening.inventory_golem_composter.label_golem_composter"), 6, 7, -16185336);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_grass_checker = new ImageButton(this.leftPos + 60, this.topPos + 61, 18, 18, 0, 0, 18, new ResourceLocation("golems_awakening:textures/screens/atlas/imagebutton_grass_checker.png"), 18, 36, e -> {
			if (true) {
				GolemsAwakeningMod.PACKET_HANDLER.sendToServer(new InventoryGolemComposterButtonMessage(0, x, y, z));
				InventoryGolemComposterButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_grass_checker", imagebutton_grass_checker);
		this.addRenderableWidget(imagebutton_grass_checker);
		grasschecked = new Checkbox(this.leftPos + 78, this.topPos + 61, 20, 20, Component.translatable("gui.golems_awakening.inventory_golem_composter.grasschecked"),

				IsGrassCheckedProcedure.execute(world, x, y, z, entity));
		guistate.put("checkbox:grasschecked", grasschecked);
		this.addRenderableWidget(grasschecked);
	}
}
