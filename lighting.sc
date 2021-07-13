_highlight_unlit_block(b, orange_threshold, red_threshold) ->
(
    if(!air(b),(
        block_loc = pos(b);
        block_x = block_loc:0 + 0.5;
        block_y = block_loc:1 + 1;
        block_z = block_loc:2 + 0.5;
        if(block_light(block_loc) <= orange_threshold, (
            particle('minecraft:dust 1 0 0 1', [block_x, block_y, block_z], 10, 0, 1, player());
        ), block_light(block_loc) <= red_threshold, (
            particle('minecraft:dust 1 1 0 1', [block_x, block_y, block_z], 10, 0, 1, player());
        ));
    ))
);

tick_number = 0;
__on_tick() ->
(
    if(tick_number%40 == 0, (
        for(rect(x,y,z,20,20,20),(
            _highlight_unlit_block(_, 11, 7);
        )))
    );
    tick_number += 1;
);