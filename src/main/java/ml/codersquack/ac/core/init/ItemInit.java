package ml.codersquack.ac.core.init;

import ml.codersquack.ac.AdvancedComputers;
import net.minecraft.item.Item;
// import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedComputers.MOD_ID);
  public static final RegistryObject<Item> DISK_PLATTER = ITEMS.register("platter",() -> new Item(new Item.Properties().tab(AdvancedComputers.ACITEMS)));
  public static final RegistryObject<Item> DISK_HEAD = ITEMS.register("head",() -> new Item(new Item.Properties().tab(AdvancedComputers.ACITEMS)));
  public static final RegistryObject<Item> NETWEB = ITEMS.register("netweb",() -> new Item(new Item.Properties().tab(AdvancedComputers.ACITEMS)));
  public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor",() -> new Item(new Item.Properties().tab(AdvancedComputers.ACITEMS)));
  public static final RegistryObject<Item> ACIG = ITEMS.register("items_group",() -> new Item(new Item.Properties()));
}
