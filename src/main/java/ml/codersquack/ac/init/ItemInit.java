package ml.codersquack.ac.init;

import ml.codersquack.ac.AdvancedComputers;
import ml.codersquack.ac.init.ItemGroupInit;
import net.minecraft.item.Item;    
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedComputers.MOD_ID);
  public static final RegistryObject<Item> DISK_PLATTER = ITEMS.register("platter",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> DISK_HEAD = ITEMS.register("head",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> NETWEB = ITEMS.register("netweb",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> CERAMIC_POWDER = ITEMS.register("ceramicpowder",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> MICROCHIP1 = ITEMS.register("microchip1",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> MICROCHIP2 = ITEMS.register("microchip2",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> MICROCHIP3 = ITEMS.register("microchip3",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> MICROCHIP4 = ITEMS.register("microchip4",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> RAW_CIRCUIT_BOARD = ITEMS.register("rawcircuitboard",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> PRINTED_CIRCUIT_BOARD = ITEMS.register("printedcircuitboard",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> ARROW_KEYS = ITEMS.register("arrowkeys",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> BUTTON_GROUP = ITEMS.register("buttongroup",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> NUMPAD = ITEMS.register("numpad",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));
  public static final RegistryObject<Item> CARD_BASE = ITEMS.register("cardbase",() -> new Item(new Item.Properties().tab(ItemGroupInit.ACITEMS)));

  public static final RegistryObject<Item> ACIG = ITEMS.register("items_group",() -> new Item(new Item.Properties()));
}
