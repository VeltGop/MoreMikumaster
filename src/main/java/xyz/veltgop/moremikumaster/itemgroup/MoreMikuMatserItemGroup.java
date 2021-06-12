
package xyz.veltgop.moremikumaster.itemgroup;

import xyz.veltgop.moremikumaster.item.MikuMasterItem;
import xyz.veltgop.moremikumaster.MoremikumasterModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MoremikumasterModElements.ModElement.Tag
public class MoreMikuMatserItemGroup extends MoremikumasterModElements.ModElement {
	public MoreMikuMatserItemGroup(MoremikumasterModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_miku_matser") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MikuMasterItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
