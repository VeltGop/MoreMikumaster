
package xyz.veltgop.moremikumaster.block;

import xyz.veltgop.moremikumaster.itemgroup.MoreMikuMatserItemGroup;
import xyz.veltgop.moremikumaster.MoremikumasterModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@MoremikumasterModElements.ModElement.Tag
public class MishenheiyaoshiBlock extends MoremikumasterModElements.ModElement {
	@ObjectHolder("moremikumaster:mishenheiyaoshi")
	public static final Block block = null;
	public MishenheiyaoshiBlock(MoremikumasterModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MoreMikuMatserItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(100f, 100f).lightValue(0).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("mishenheiyaoshi");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
