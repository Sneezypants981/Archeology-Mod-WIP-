
package net.mcreator.archeologyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.archeologyideas.ArcheologyIdeasModElements;

@ArcheologyIdeasModElements.ModElement.Tag
public class OmenItem extends ArcheologyIdeasModElements.ModElement {
	@ObjectHolder("archeology_ideas:omen")
	public static final Item block = null;
	public OmenItem(ArcheologyIdeasModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ArcheologyIdeasModElements.sounds.get(new ResourceLocation("archeology_ideas:omen")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("omen");
		}
	}
}
