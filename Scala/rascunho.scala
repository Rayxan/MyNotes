

      // case CaseStmt(exp, cases, elseStmt) => { //v.getvalue evalExpression.as instanceof - converte pra inteiro 
      //   while (evalCondition(exp)) {
      //     if(evalExpression(exp) == evalExpression(condition))
      //       stmt.accept(this)
      //     else  if((evalExpression(exp) > evalExpression(min)) && (evalExpression(exp) < evalExpression(max)))
      //       stmt.accept(this)
      //   }
      // }


      

      /*
      case CaseStmt(exp, cases, elseCase) => {

        
        while (evalCondition(exp)) {
          if(cases){

            case SimpleAlternative(caseValue, stmt) => if (evalExpression(condition)) stmt.accept(this) else elseStmt.get.accept(this)
            case RangeAlternative(min, max, stmt)  => if  (evalExpression(min) && evalExpression(max)) stmt.accept(this) else elseStmt.get.accept(this)
        
          }
        } 
      */
