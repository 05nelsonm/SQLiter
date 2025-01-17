package co.touchlab.sqliter.interop

import cnames.structs.sqlite3_stmt
import kotlinx.cinterop.CPointer

typealias SqliteDatabasePointer = CPointer<co.touchlab.sqliter.sqlite3.sqlite3>
typealias SqliteStatementPointer = CPointer<sqlite3_stmt>