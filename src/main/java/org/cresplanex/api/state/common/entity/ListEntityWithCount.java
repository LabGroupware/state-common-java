package org.cresplanex.api.state.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ListEntityWithCount<Data> {

    List<Data> data;
    int count;
}
