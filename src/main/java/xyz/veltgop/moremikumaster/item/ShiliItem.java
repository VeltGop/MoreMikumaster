
package xyz.veltgop.moremikumaster.item;

import xyz.veltgop.moremikumaster.itemgroup.MoreMikuMatserItemGroup;
import xyz.veltgop.moremikumaster.MoremikumasterModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MoremikumasterModElements.ModElement.Tag
public class ShiliItem extends MoremikumasterModElements.ModElement {
	@ObjectHolder("moremikumaster:shili")
	public static final Item block = null;
	public ShiliItem(MoremikumasterModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMikuMatserItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("shili");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
