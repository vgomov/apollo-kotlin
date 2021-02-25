package com.apollographql.apollo3.api

/**
 * A sealed class that can either be [Present] or [Absent]
 *
 * It provides a convenient way to distinguish the case when a value is provided explicitly and should be
 * serialized (even if it's null) and the case where it's absent and shouldn't be serialized.
 */
sealed class Input<out V> {
  class Present<V>(val value: V) : Input<V>()
  object Absent : Input<Nothing>()
}

