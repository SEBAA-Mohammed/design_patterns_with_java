package com.mohammedsebaa;

import java.util.List;
import java.util.Map;

public interface SQLExpression {
    List<Map<String, Object>> execute(DatabaseContext context);
}
