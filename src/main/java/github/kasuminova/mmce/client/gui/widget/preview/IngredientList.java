package github.kasuminova.mmce.client.gui.widget.preview;

import github.kasuminova.mmce.client.gui.widget.base.WidgetGui;
import github.kasuminova.mmce.client.gui.widget.container.Row;
import github.kasuminova.mmce.client.gui.widget.container.ScrollingColumn;
import github.kasuminova.mmce.client.gui.widget.slot.SlotVirtual;
import net.minecraft.item.ItemStack;

import java.util.List;

import static github.kasuminova.mmce.client.gui.widget.preview.MachineStructurePreviewPanel.WIDGETS_TEX_LOCATION;

public class IngredientList extends ScrollingColumn {

    public static final int MAX_STACK_PER_ROW = 9;

    public IngredientList() {
        setWidthHeight(174, 36);
    }

    @Override
    public void initWidget(final WidgetGui gui) {
        super.initWidget(gui);
        scrollbar.setMargin(3, 1, 1, 1);
        scrollbar.setWidthHeight(8, 34);
        scrollbar.getScroll()
                .setMouseDownTextureXY(204, 127)
                .setHoveredTextureXY(194, 127)
                .setTextureXY(184, 127)
                .setUnavailableTextureXY(214, 127)
                .setTextureLocation(WIDGETS_TEX_LOCATION)
                .setWidthHeight(8, 13);
    }

    public IngredientList setStackList(final List<ItemStack> list) {
        getWidgets().clear();

        Row row = new Row();
        int stackPerRow = 0;
        for (int i = 0; i < list.size(); i++) {
            final ItemStack stack = list.get(i);
            row.addWidget(SlotVirtual.ofJEI(stack)
                    .setSlotTexLocation(WIDGETS_TEX_LOCATION)
                    .setSlotTexX(184).setSlotTexY(178)
            );
            stackPerRow++;
            if (stackPerRow >= MAX_STACK_PER_ROW && i + 1 < list.size()) {
                addWidget(row);
                row = new Row();
                stackPerRow = 0;
            }
        }
        addWidget(row);
        return this;
    }

}
